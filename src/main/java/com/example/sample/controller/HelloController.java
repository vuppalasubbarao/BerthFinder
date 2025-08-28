package com.example.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/api")
public class HelloController {

    @GetMapping(value = "/hello", produces = "text/html")
    public String getHtml() {
        return "<html><body><h1>Hello, Spring Boot!</h1></body></html>";
    }

}
