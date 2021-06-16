package com.spring;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloRestControllerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloRestControllerApplication.class, args);
	}
	
	@RestController
	@RequestMapping("/hello")
	public class HelloController {
	 // curl localhost: 8080/hello -w "\n"
		@RequestMapping(value = {"", "/", "/home" })
		public String sayHello() {
			return "Hello From Bridgelabz!!";
			
		}
		// curl localhost:8080/hello/query?name=Ashok -w "\n"
		@RequestMapping(value = {"/query"}, method= RequestMethod.GET)
		public String sayHello(@RequestParam(value="name")String name) {
			return "Hello "+ name + "!";
		}
		// curl localhost:8080/hello/param/Ashok -w "\n"
		@GetMapping("/param/{name}")
		public String sayHelloParam(@PathVariable String name) {
			return "Hello "+name+ "!";
		}
//		curl -X POST -H "Content-Type: application/json" -d
//		'{"firstName": ”Mark","lastName": ”Taylor"}'
//		"http://localhost:8080/hello/post" -w "\n"
	
	 @PostMapping("/post")
	    public String sayHello(@RequestBody User user) {
	        return "Hello " + user.getFirstName()+" "+user.getLastName()+"!";
	    }
	}
}


