package com.springmvc.basics;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

	@RequestMapping("/employee")
	public String createEmployee(Model model) {
		// This employee bean will be populated automatically in employee.jsp page because of spring form tag
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "employee";
	}

	@PostMapping("/processEmployee")
	public String processEmployee(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindingResult,Model model) {
		System.out.println(employee);
		// Employee bean in method param is populated automatically
		model.addAttribute("employee", employee);
		if(bindingResult.hasErrors()) {
			return "employee";
		}else {
			return "employee-confirmation";
		}
	}
}
