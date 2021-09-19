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

	// Spring will create ModelAndView Object and injects it in method params
	@RequestMapping("/v2")
	public ModelAndView showFormPage(ModelAndView modelAndView) {
		modelAndView.setViewName("home");
		return modelAndView;
	}
	
	// Example of forwarding request(to URL in same app)
	@RequestMapping("/v1/forward")
	public String showFormPageForwardReq() {
		return "forward:/";
	}
	
	// Example of redirecting request(to URL in different app)
	@RequestMapping("/v1/redirect")
	public String showFormPageRedirectReq() {
		return "redirect:https://www.google.com/";
	}
}