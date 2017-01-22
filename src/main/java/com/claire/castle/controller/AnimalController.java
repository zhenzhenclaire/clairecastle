package com.claire.castle.controller;

import com.claire.castle.db.model.Animal;
import com.claire.castle.service.AnimalService;
import com.claire.castle.service.UserService;
import com.claire.castle.utils.TestData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/animal")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @RequestMapping("/")
    public String index(Model model, HttpServletRequest request, HttpServletResponse response) {

        List<Animal> animals = animalService.getAllAnimals();
        model.addAttribute("animals",animals);

        return "/animal/index";
    }

}
