package com.spring;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloRestControllerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloRestControllerApplication.class, args);
	}
	
	@RestController
	public class HelloController {
	 
	    @RequestMapping("/hello")
	    public String hello(@RequestParam(name = "name", defaultValue = "World") String name)  {
	    	    return "Hello " + name;
	    
	}
}
}


