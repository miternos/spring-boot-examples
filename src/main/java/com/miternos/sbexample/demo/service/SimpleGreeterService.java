package com.miternos.sbexample.demo.service;

import com.miternos.sbexample.demo.bean.RequestBean;
import com.miternos.sbexample.demo.bean.ResponseBean;
import org.springframework.stereotype.Service;

@Service
public class SimpleGreeterService {

    public ResponseBean greetSimply(RequestBean request){
        String desc = "Hello "+request.getName() + " " + request.getSurname();

        ResponseBean responseBean = new ResponseBean();
        responseBean.setResponseCode("0");
        responseBean.setResponseDescription(desc);
        return responseBean;
    }
}
