package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
public class MainController {

    @GetMapping("/greeting") //http://localhost:8080/greeting?name=Vasya&age=10
    public String greeting(@RequestParam(required = false, defaultValue = "World") String name, @RequestParam int age, Model model) {
        Date date = new Date();
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        model.addAttribute("date", date);
        return "greeting";
    }
}