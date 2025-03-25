package com.example.demo.controller;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


public class ModelSpringController {
    @GetMapping("/hoge")
    public String hoge(Model model){
        
        model.addAttribute("12", "hi");
        return("hello-spring");
    }
}
