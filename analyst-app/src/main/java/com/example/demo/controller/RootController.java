package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RootController {

    public RootController() {
    }

    @GetMapping("/")
    public String greeting(@RequestParam(defaultValue = "World") String name, Model model) {

        model.addAttribute("name", name);

        return "greeting";
        
    }

}