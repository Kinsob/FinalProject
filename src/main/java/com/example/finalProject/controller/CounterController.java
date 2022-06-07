package com.example.finalProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController {

    @RequestMapping("/counter")
    private String showCounter() {
        return "counter";
    }
}
