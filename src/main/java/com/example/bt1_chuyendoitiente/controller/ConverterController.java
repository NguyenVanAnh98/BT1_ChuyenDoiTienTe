package com.example.bt1_chuyendoitiente.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConverterController {

    @GetMapping("/index")
    public String showForm() {
        return "index";
    }

    @PostMapping("/convert")
    public String convert(@RequestParam("exchangeRate") double exchangeRate,
                          @RequestParam("usdAmount") double usdAmount,
                          Model model) {
        double vndAmount = exchangeRate * usdAmount;
        model.addAttribute("vndAmount", vndAmount);
        return "result";
    }
}