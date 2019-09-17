package com.microservice.demo1.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorldController {
	
	/* 
	   we can map the browser reqest using Requst mapping annotation and request mapping method 
	   and url should be given within the brackets.And also, @GetMapping , @PostMapping annotations
	   are available as well . 
	*/
	@RequestMapping(method=RequestMethod.GET,path="/hello-world")
	public String helloWorld() {
		return "hello world";
	}
	
	@GetMapping(path="/hello-world-2")
	public String helloWorld2() {
		return "hello world 2";
	}
	
	/*
	 	Now let's see how to return the class object from particular method..
	 	
	 */
	
	@GetMapping(path="/hello-world-3/{name}")
	public helloWorldBean helloWorld3(@PathVariable String name) {
		return new helloWorldBean(String.format("hello , %s", name));
	}
	
	

}
