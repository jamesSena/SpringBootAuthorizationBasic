package br.com.jamesson.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RestController
@RequestMapping("/secret")
public class TestController {
    @RequestMapping(value = "/favoriteSoccerTeam", method = RequestMethod.POST)
    public String soccerTeam() {
        return "Palmeiras";
    }
}