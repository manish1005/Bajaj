package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.A;
import com.example.demo.services.A_service;

@RestController
public class A_controller {

	
	@Autowired
	A_service aservice;
	
	
	
	@PostMapping("/bfhl")
	public String save(@RequestBody A a)
	{
		if(aservice.status=="true")
		return "true";
		else
			return "false";
		
	}
	
	@PostMapping("/bfh")
	public A savec(@RequestBody A a)
	{
			return aservice.savec(a);
	}
	
}
