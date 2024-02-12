package com.example.seminar4_HomeWork.controller;

import com.example.seminar4_HomeWork.model.Form;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import java.text.Normalizer;

@Controller
public class FormController {
    @GetMapping
    public String showForm(Model model){
        model.addAttribute("form", new Form());
        return "form";
    }
    @PostMapping
    public String submitForm(@ModelAttribute("form")Normalizer.Form form, Model model){
        model.addAttribute("data", form);
        return "results";
    }
}
