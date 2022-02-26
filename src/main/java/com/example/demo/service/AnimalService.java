package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class AnimalService {

    public String showAnimal(String name){
        return name;
    }

    public String showRace(String race){
        return race;
    }
}
