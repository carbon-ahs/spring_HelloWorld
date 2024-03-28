package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class MyController {

    @RequestMapping("m")
    public String requestMethodName(@RequestParam String param) {
        return new String();
    }
    @RequestMapping("a")
    public static String myMethod(){
        return "Hlw World";
    }
}
