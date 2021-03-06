package com.sonata.formexample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/form")
public class FormController {
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView showForm() 
	{
		ModelAndView mv = new ModelAndView("form");
		return mv;
	}
	@RequestMapping(method=RequestMethod.POST)
	public String handleForm(@RequestParam("name") String name, @RequestParam("uname") String username, @RequestParam("pass") String password, Model model) {
		System.out.println("The user name is: "+ username);
		System.out.println("Name of the person is: "+ name);
		System.out.println("The password is: "+ password);
		
		model.addAttribute("uname", username);
		model.addAttribute("pass", password);
		model.addAttribute("name", name);
	
		return "success";
	}
	
}
