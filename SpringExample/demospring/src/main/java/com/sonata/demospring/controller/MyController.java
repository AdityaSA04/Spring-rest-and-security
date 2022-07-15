package com.sonata.demospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/helloworld")
public class MyController {
	@RequestMapping(method=RequestMethod.GET)
	public String helloworld(ModelMap modelMap) {
	modelMap.addAttribute("message1","Aditya S A");
	return "hello";	
}
	@RequestMapping("/login")
	public String validateUser(@RequestParam("username") String username , @RequestParam("password") String password, Model model) {
		model.addAttribute("username", username);
		return "home";
	}
	@RequestMapping("/path/{empid}/{empname}")
		public String pathdemo(@PathVariable int empid, @PathVariable String empname, Model model) {
			model.addAttribute("empid", empid);
			return "path";
		}
	@RequestMapping("/index")
	public String Showlogin() {
		return "login";
	}
	}

