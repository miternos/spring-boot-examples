package com.miternos.sbexample.demo;


import com.miternos.sbexample.demo.bean.RequestBean;
import com.miternos.sbexample.demo.bean.ResponseBean;
import org.springframework.web.bind.annotation.*;

@RestController
public class Greeting2 {

    @PostMapping("/greetingpost")
    public ResponseBean greeting(@RequestBody RequestBean request) {

        String desc = "Hello "+request.getName() + " " + request.getSurname();

        ResponseBean responseBean = new ResponseBean();
        responseBean.setResponseCode("0");
        responseBean.setResponseDescription(desc);

        return responseBean;

    }
}
