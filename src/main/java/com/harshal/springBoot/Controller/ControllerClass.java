package com.harshal.springBoot.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {
@RequestMapping("/hello")	
public String M1(){
	return "This is Message From Controller";
	
}
}
