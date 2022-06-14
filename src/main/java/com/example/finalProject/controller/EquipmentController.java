package com.example.finalProject.controller;

import com.example.finalProject.EquipmentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EquipmentController {
private final EquipmentRepository equipmentRepository;

    public EquipmentController(EquipmentRepository equipmentRepository) {
        this.equipmentRepository = equipmentRepository;
    }

    @RequestMapping("/equipment")
    private String showEquipment(Model model) {
        model.addAttribute("equipments", equipmentRepository.findAll());
        return "equipment";
    }
}
