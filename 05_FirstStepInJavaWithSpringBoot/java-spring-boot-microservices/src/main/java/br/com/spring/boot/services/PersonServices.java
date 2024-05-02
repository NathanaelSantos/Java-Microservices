package br.com.spring.boot.services;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.spring.boot.exceptions.ResourceNotFoundException;
import br.com.spring.boot.model.Person;
import br.com.spring.boot.repositories.PersonRepository;

@Service
public class PersonServices {
	private Logger logger = Logger.getLogger(PersonServices.class.getName());
	
	@Autowired
	PersonRepository repository;
	
	public Person findById(Long id) {
		logger.info("Finding one person");	
		return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));
	}

	public List<Person> findAll() {
		List<Person> persons = new ArrayList<>();
		return repository.findAll();
	}
	
	public Person create(Person person) {
		logger.info("Creating one person");
		return repository.save(person);
	}
	
	public Person update(Person person) {
		logger.info("Updating one person");
		
		Person entity = repository.findById(person.getId()).orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));
		
		entity.setFirstName(person.getFirstName());
		entity.setLastName(person.getLastName());
		entity.setAddress(person.getAddress());
		entity.setGender(person.getGender());
		
		return repository.save(entity);
	}
	
	public void delete(Long id) {
		logger.info("Deleting one person");
		Person entity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));
		repository.delete(entity);
	}
}
