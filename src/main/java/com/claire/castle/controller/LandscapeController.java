package com.claire.castle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/landscape")
public class LandscapeController {

    @RequestMapping("/")
    public String index() {
        return "/landscape/index";
    }
}
