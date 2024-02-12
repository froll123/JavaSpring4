package com.example.seminar4_2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Random;

@Controller
public class RandomController {
    @GetMapping("/random")
    public String getRandomNumber(Model model){
        Random random = new Random();
        model.addAttribute("number", random.nextInt(100) + 1);
        return "random";
    }
}
