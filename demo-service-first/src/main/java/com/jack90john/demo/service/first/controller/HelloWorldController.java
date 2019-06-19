package com.jack90john.demo.service.first.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Description
 *
 * @author jack
 * @version 1.0.0
 * @since
 */

@Controller
public class HelloWorldController {

    @GetMapping("/hello/world")
    public String helloWorld() {
        return "hello world";
    }

}
