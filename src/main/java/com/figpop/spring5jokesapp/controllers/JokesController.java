package com.figpop.spring5jokesapp.controllers;

import com.figpop.spring5jokesapp.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private final JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping({"/", ""})
    public String showQuotes(Model model) {
        model.addAttribute("jokes", jokesService.getJokes());

        return "JokesView";
    }
}
