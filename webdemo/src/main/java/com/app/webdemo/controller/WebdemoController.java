package com.app.webdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.webdemo.model.RegistrationForm;

@Controller
public class WebdemoController {

    // Serve the index.html page
    @GetMapping("/")
    public String home() {
        return "index"; // returns Thymeleafe template index.html
    }

   // Display the registration form
    @GetMapping("/registration")
    public String showRegistrationForm() {
        return "registration"; // returns Thymeleafe template registration.html
    }
}
