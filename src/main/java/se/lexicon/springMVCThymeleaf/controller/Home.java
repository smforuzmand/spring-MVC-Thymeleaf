package se.lexicon.springMVCThymeleaf.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/Home")
public class Home {


    List<String> strings;



    @GetMapping(path = "/index")
    public String index() {
        return "indexView";
    }

    @GetMapping("/custom")
    public String contactList(Model theModel) {
        strings = new ArrayList<>();
        theModel.addAttribute("stringList", strings);
        return "stringView";

    }



    @PostMapping ("/contact")
    public String contact(@RequestParam("name") String name , Model model) {

        System.out.println("name = " + name);
        model.addAttribute("contactView", strings);

        return "contactView";
    }

}
