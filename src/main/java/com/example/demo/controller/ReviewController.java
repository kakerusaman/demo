package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.form.ReviewRegistForm;

@Controller
public class ReviewController {
    // @GetMapping("/show-review-form")
    // public String showReviewForm(){


    //     return "regist-review";
    // }

    // @PostMapping("/regist-review")
    // public String registReview(@ModelAttribute ReviewRegistForm form){
    //     System.out.println(form);

    //     return "confirm-regist-review";
    // }

    @GetMapping("/show-review-form")
    public String showReviewForm(@ModelAttribute ReviewRegistForm form){
        return "regist-review";

    }
    @PostMapping("/regist-review")
    public String showRegistReviewRet(@ModelAttribute ReviewRegistForm form){
        return "regist-review";
    }

    @PostMapping("/regist-review")
    public String registReview(@ModelAttribute ReviewRegistForm form){
        return "confirm-regist-review";
    }

    @PostMapping("/confirm-regist-review")
    public String confirmRegistReview(ReviewRegistForm form, Model model){
        model.addAttribute("msg", "登録が完了しました。");
        return "confirm-regist-review";
    }




}
