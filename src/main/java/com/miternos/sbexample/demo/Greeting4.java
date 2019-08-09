package com.miternos.sbexample.demo;


import com.miternos.sbexample.demo.bean.RequestBean;
import com.miternos.sbexample.demo.bean.ResponseBean;
import com.miternos.sbexample.demo.service.SimpleGreeterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Secured("ROLE_ADMIN")
public class Greeting4 {

    @Autowired
    private SimpleGreeterService simpleGreeterService;

    @PostMapping("/greetingauthfromdb")
    public ResponseBean greeting(@RequestBody RequestBean request) {

        return simpleGreeterService.greetSimply(request);

    }
}
