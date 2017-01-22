package com.claire.castle.db.mapper;

import com.claire.castle.db.model.Animal;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AnimalMapper {

    public List<Animal> getAllAnimals();

    public Animal getAnimalById(@Param("id") String id);

}
