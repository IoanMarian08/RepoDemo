package com.example.demo.api;

import com.example.demo.model.Person;
import com.example.demo.service.AnimalService;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/person")
@RestController
public class PersonController {

    private final PersonService personService;
    private final AnimalService animalService;

    @Autowired
    public PersonController(PersonService personService, AnimalService animalService) {
        this.personService = personService;
        this.animalService = animalService;
    }

    @PostMapping
    public void addPerson(@RequestBody Person person){
        personService.addPerson(person);
    }

    @GetMapping
    public List<Person> getAllPeople(){
        return personService.getAllPeope();
    }
}
