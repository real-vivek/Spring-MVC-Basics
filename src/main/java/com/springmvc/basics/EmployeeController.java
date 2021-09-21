package com.springmvc.basics;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String processEmployee(@ModelAttribute("employee") Employee employee, Model model) {
		// Employee bean in method param is populated automatically
		model.addAttribute("employee", employee);
		return "employee-confirmation";
	}
}
