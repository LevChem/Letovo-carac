package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
    @Autowired
    private CaracAction caracAction;


    @GetMapping(path = "/add")
    public @ResponseBody String add(@RequestParam String name, @RequestParam String maker, @RequestParam Integer size){
        Carac carac = new Carac();
        carac.setName(name);
        carac.setMaker(maker);
        carac.setSize(size);
        caracAction.save(carac);
        return "Saved carac!";
    }
}
