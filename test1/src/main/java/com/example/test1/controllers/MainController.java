package com.example.test1.controllers;

import com.example.test1.MassageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping("/app")
public class MainController {
    @Autowired
    private MassageService massageService;


    @RequestMapping(value = "/root", method = RequestMethod.GET)
    public String greetingPage() {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("greeting.html");
        return "greeting";
    }


    @RequestMapping(value = "/send", method = RequestMethod.POST)
    public ModelAndView sendMessage(
            @RequestParam("text") String text,
            @RequestParam("tag") String tag) {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("main.html");
        modelAndView.addObject("messages", massageService.work(text, tag));

        return modelAndView;
    }

//    @RequestMapping(value = "/a", method = RequestMethod.GET)
//    public ModelAndView mainPage() {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("main");
//
//        return modelAndView;
//    }

    @RequestMapping(value = "/a", method = RequestMethod.GET)
    public ModelAndView mainPage1() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("greeting.html");
        return modelAndView;
    }

}
