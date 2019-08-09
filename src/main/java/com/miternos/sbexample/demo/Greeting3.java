package com.miternos.sbexample.demo;


import com.miternos.sbexample.demo.bean.RequestBean;
import com.miternos.sbexample.demo.bean.ResponseBean;
import com.miternos.sbexample.demo.service.SimpleGreeterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greeting3 {

    @Autowired
    private SimpleGreeterService simpleGreeterService;

    @PostMapping("/greetingpostwithinjection")
    public ResponseBean greeting(@RequestBody RequestBean request) {

        return simpleGreeterService.greetSimply(request);

    }
}
