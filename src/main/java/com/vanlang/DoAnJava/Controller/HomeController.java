package com.vanlang.DoAnJava.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/HTML")
    public String homepage(Model model) {
        return "HTML/home";
    }
}
