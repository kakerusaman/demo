package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;




@Controller
public class ParamController {
    @GetMapping("/get-param")
    //public String getParam(@RequestParam String greeting, Model model) {
    public String getParam(@RequestParam(name="g") String greeting, Model model){
    //public String getParam(@RequestParam(required=false, String greeting, Model model)){
    //public String getParam(@RequestParam(defaultValue="(未設定)"))String greeting, Model model){

        model.addAttribute("mgreeting", greeting);
        return "display";
    }

    @GetMapping("/input")
    public String input() {
        return "input";
    }

    @PostMapping("/post-param")
    public String postMethodName(@RequestParam String greeting, Model model) {
        model.addAttribute("mGreeting",greeting);

        return "display";
    }
    
    
    
    
}
