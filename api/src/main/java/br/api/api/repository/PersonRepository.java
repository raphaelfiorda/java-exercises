package br.api.api.repository;

import br.api.api.models.Person;
import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

    List<Person> findAll();
}
