package br.api.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import br.api.api.models.Person;
import br.api.api.repository.PersonRepository;

@RestController
public class Controller {

    @Autowired
    private PersonRepository action;

    @PostMapping("/person")
    public Person insert(@RequestBody Person p) {
        return action.save(p);
    }

    @GetMapping("/people")
    public List<Person> listAll() {
        return action.findAll();
    }
}
