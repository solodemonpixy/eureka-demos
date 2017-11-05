package com.alex.eureka.client.demo1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/test")
public class TestController {

    private final Logger LOG = LoggerFactory.getLogger(getClass());

    @Autowired
    private Registration registration;

    @RequestMapping("/hello")
    public String test(){
        LOG.info("/hello,serviceId:"+registration.getServiceId());
        return "hello world demo1";
    }

}
