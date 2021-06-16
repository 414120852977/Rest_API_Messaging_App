package com.spring;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	 
	    @RequestMapping("/hello/Mark")
	    public String hello(@RequestParam(name = "Mark", defaultValue = "From Bridgelabz") String name)  {
	    	    return "Hello " + name;
	    
	}
	    
	    @RequestMapping("/response")
	    @PostMapping("/postBody")
	    public String postBody(@RequestBody String firstName, String lastName) {
	        return "Hello " + firstName+lastName;
	    }
}
}


