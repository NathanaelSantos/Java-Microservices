package br.com.spring.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.spring.boot.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
