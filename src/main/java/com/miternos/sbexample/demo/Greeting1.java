package com.miternos.sbexample.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class Greeting1 {

    @RequestMapping("/greetingbasic")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return "Hello "+name;
    }
}
