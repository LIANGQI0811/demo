package com.kgeek.cn.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(value = "/hello")
public class HelloController {
    @GetMapping(value = "/word")
    public ModelAndView word() {
        System.out.println('a');
        return  new ModelAndView();
    }
}
