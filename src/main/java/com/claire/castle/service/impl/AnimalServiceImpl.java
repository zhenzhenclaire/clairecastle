package com.claire.castle.service.impl;

import com.claire.castle.db.mapper.AnimalMapper;
import com.claire.castle.db.model.Animal;
import com.claire.castle.db.model.User;
import com.claire.castle.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("animalService")
public class AnimalServiceImpl implements AnimalService {

    @Autowired
    AnimalMapper animalMapper;

    public List<Animal> getAllAnimals(){
        return animalMapper.getAllAnimals();
    }

}
