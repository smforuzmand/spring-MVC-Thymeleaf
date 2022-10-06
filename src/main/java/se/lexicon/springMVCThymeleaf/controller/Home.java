package se.lexicon.springMVCThymeleaf.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {


    @GetMapping(path = "/index")
    public String index(){

        return "index";

    }






}
