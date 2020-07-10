package com.kpatil.springlogindemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @Value("${spring.security.user.name}")
    private String user;

    @GetMapping
    public String home(Model model) {
        model.addAttribute("user", user);
        return "home";
    }
}
