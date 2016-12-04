package com.claire.castle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/botany")
public class BotanyController {

    @RequestMapping("/")
    public String index() {
        return "/botany/index";
    }
}
