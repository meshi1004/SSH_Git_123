package com.edu.seiryo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/test")
public class TestController {
	
	@RequestMapping(value = "/helloworld")
	public String helloWorld() {
		System.out.println("success");
		return "success";
	}
	@RequestMapping(value = "/hello",method = RequestMethod.POST)
	public String hello() {
		System.out.println("success");
		return "success";
	}
	@RequestMapping(value = "/testParam",params = {"username=tom"})
	public String testParam() {
		System.out.println("success");
		return "success";
	}
	
//	@RequestMapping(value = "/AntTest/*/abc")
//	@RequestMapping(value = "/AntTest/**/abc")
	@RequestMapping(value = "/AntTest/abc???")
	public String antTest() {
		System.out.println("success");
		return "success";
	}

	@RequestMapping(value = "/testPath/{id}")
    public String testPath(@PathVariable("id") int id) {
        System.out.println("success: " + id);
        return "success";
    }
}
