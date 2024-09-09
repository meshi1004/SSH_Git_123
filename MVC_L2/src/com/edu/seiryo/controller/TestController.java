package com.edu.seiryo.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.edu.seiryo.entity.User;

@Controller
@RequestMapping("/test")
@SessionAttributes(value = {"user"})
public class TestController {
	
	@RequestMapping(value = "/testRequestParam")
	public String testRequestParam(@RequestParam("username")String username) {
		System.out.println("username:" +username);
		return "success";
	}
	
	@RequestMapping(value = "/testRequestHeader")
	public String testRequestHeader(@RequestHeader("Accept-Language")String language) {
		System.out.println("language:" +language);
		return "success";
	}
	
	@RequestMapping(value = "/testCookie")
	public String testCookie(@CookieValue("JSESSIONID") String cookie) {
		System.out.println("cookie:" +cookie);
		return "success";
	}
	
	@RequestMapping(value = "/testUser",method = RequestMethod.POST)
	public String testUser(User user) {
		System.out.println("user:" +user);
		return "success";
	}
	
	@RequestMapping(value = "/testRequest")
	public String testRequest(HttpServletRequest request,HttpServletResponse response) throws IOException {
		String name=request.getParameter("name");
		String pwd=request.getParameter("pwd");
		PrintWriter writer =  response.getWriter();
		writer.print(name);
		writer.print(pwd);
		return "success";
	}
	
	@RequestMapping(value = "/modelAndView")
	public ModelAndView modelAndView() {
		
		System.out.println("modelAndView");
		String viewName="success2";
		ModelAndView mv = new ModelAndView(viewName);
		mv.addObject("user",new User("abc", "123"));
		return mv;
	}
	
	@RequestMapping(value = "/testMap")
	public String testMap(Map<String,Object> map) {
		System.out.println("testMap");
		map.put("user",new User("abc", "123"));
		return "success2";
	}
	
	@RequestMapping(value = "/testModel")
	public String testModel(Model model) {
		System.out.println("testModel");
		model.addAttribute("user",new User("abc", "123"));
		return "success2";
	}
	
	@RequestMapping(value = "/testSession")
	public String testSession(Map<String,Object> map,HttpSession session) {
		System.out.println("testSession");
		session.setAttribute("user",new User("sada", "456"));
		map.put("user",new User("abc", "123"));
		return "success2";
	}
	
	@RequestMapping(value = "/testSessionAttribute")
	public String testSessionAttribute(Map<String,Object> map) {
		System.out.println("testSessionAttribute");
		map.put("user",new User("abc", "123"));
		return "success2";
	}
	@RequestMapping(value = "/testRedirect")
	public String testRedirect() {
		System.out.println("testRedicter");
		return "redirect:/abc.jsp";
	}
}
