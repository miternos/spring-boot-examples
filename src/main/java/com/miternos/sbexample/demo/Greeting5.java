package com.miternos.sbexample.demo;


import com.miternos.sbexample.demo.bean.RequestBean;
import com.miternos.sbexample.demo.bean.ResponseBean;
import com.miternos.sbexample.demo.service.KafkaTrxLogProducer;
import com.miternos.sbexample.demo.service.SimpleGreeterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Secured("ROLE_ADMIN")
public class Greeting5 {

    @Autowired
    private SimpleGreeterService simpleGreeterService;

    @Autowired
    private KafkaTrxLogProducer kafkaTrxLogProducer;

    @PostMapping("/greetingkafka")
    public ResponseBean greeting(@RequestBody RequestBean request) {
        long time = System.currentTimeMillis();

        ResponseBean response =  simpleGreeterService.greetSimply(request);

        time = System.currentTimeMillis() - time ;

        String trxLog = "Request: name="+request.getName()+" surname="+request.getSurname()+" Response: "+response.getResponseDescription()+" elapsed: "+time;

        kafkaTrxLogProducer.send(trxLog);

        return response;



    }
}
