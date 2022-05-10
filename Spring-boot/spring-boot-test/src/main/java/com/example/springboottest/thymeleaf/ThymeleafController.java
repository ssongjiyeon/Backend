package com.example.springboottest.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafController {
    @GetMapping("/thymeleaf")
    public String hello(Model model) {
        model.addAttribute("name", "jiyeon");
        return "thymeleaf";
    }
}
