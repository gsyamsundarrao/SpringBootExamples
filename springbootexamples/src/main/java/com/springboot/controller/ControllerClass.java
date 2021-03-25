package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.service.ServiceLayerClass;

@RestController
@EnableAutoConfiguration
public class ControllerClass {
	
	@Autowired
	private ServiceLayerClass sc;
	
	@RequestMapping("/")
    String hello() {		
		
        return sc.method1();
    }

}
