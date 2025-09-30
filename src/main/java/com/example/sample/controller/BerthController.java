package com.example.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BerthController {

    @PostMapping("/check")
    public String checkBerth(@RequestParam int berthNumber, Model model) {
        String result;

        if(berthNumber<1){
            result =  "Invalid Berth Number";
        }
        // Simple logic
        if (berthNumber % 8 == 1 || berthNumber % 8 == 4) {
            result = "Lower Berth";
        } else if (berthNumber % 8 == 2 || berthNumber % 8 == 5) {
            result = "Middle Berth";
        } else if (berthNumber % 8 == 3 || berthNumber % 8 == 6) {
            result = "Upper Berth";
        } else if (berthNumber % 8 == 7) {
            result = "Side Lower";
        } else {
            result = "Side Upper";
        }

        model.addAttribute("result", result);
        return "index";  // returns to index.html
    }

    @GetMapping("/")
    public String home() {
        return "index"; // Show form initially
    }
}


