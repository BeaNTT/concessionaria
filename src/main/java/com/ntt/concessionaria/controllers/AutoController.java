package com.ntt.concessionaria.controllers;

import com.ntt.concessionaria.repositories.AutoRep;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AutoController {
    //gestisce le richieste
    private final AutoRep arep;

    //constructor injection
    public AutoController(AutoRep arep){
        this.arep=arep;
    }

    //richiesta get di lista delle auto
    @GetMapping("/automobili")
    public String getAuto(Model model){
        model.addAttribute("automobili",arep.findAll());
        return "auto";
    }
}
