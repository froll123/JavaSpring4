package com.example.seminar4_HomeWork.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import com.example.seminar4_HomeWork.model.Form;
import com.example.seminar4_HomeWork.controller.HelloWorldController;
import com.example.seminar4_HomeWork.controller.FormController;

@Controller
public class HelloWorldController {
    @RequestMapping("/")
    public String helloWorld(Model model){
        model.addAttribute("message", "Привет, мир!");
        return "hello";
    }
}
