package com.springmvc.basics;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping("/")
	public String showHomePage() {
		return "home";
	}

	@RequestMapping("/v1")
	public ModelAndView showFormPage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home");
		return modelAndView;
	}

	@RequestMapping("/v2")
	public ModelAndView showFormPage(ModelAndView modelAndView) {
		modelAndView.setViewName("home");
		return modelAndView;
	}

}