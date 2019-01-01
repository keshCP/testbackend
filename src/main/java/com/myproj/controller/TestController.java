package com.myproj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping(value="/testCall")
	public String testCall() {
		return "WELCOME";
	}
	
}
