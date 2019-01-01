package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class Roewpo {

    @GetMapping("/")
    public String greeting(Model model) {
        ArrayList<String> attributeValue = new ArrayList<>();
        attributeValue.add("Jeden");
        attributeValue.add("Dwa");
        attributeValue.add("Trzy");
        model.addAttribute("strings", attributeValue);
        return "greeting";
    }

}
