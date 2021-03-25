package com.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.ConnectDAO;

@Service
public class ServiceLayerClass {
	
	@Autowired
	private ConnectDAO dao;
	
	ServiceLayerClass() {}
	
	public String method1() {
		
		
		return dao.methodDAO();
	}
}
