package com.example.finalProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EquipmentController {

    @RequestMapping("/equipment")
    private String showEquipment() {
        return "equipment";
    }
}
