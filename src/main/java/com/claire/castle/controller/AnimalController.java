package com.claire.castle.controller;

import com.claire.castle.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/animal")
public class AnimalController {

    @RequestMapping("/")
    public String index() {
        return "/animal/index";
    }

}
