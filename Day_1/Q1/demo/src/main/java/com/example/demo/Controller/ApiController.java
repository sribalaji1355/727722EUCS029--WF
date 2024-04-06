package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ApiController {

    @GetMapping("/Welcome")

    public String welcome() {
        return "Welcome Springboot";
    }
}
