package com.stackroute.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class AppController {
    @RequestMapping("/")
    public String message()
    {
        return  "index";
    }
    @RequestMapping("/message")
    //public String getGreetings() {

    public ModelAndView message(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        String username = httpServletRequest.getParameter("name");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("greetings");
        modelAndView.addObject("result", username);

        return modelAndView;
    }
}
