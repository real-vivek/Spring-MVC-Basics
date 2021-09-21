package com.springmvc.basics;

import java.util.LinkedHashMap;

public class Employee {

	private String firstName;
	private String lastName;
	private String department;
	private LinkedHashMap<String, String> deptartmentOptions;

	public Employee() {
		// department will be populated with the key and label on jsp page will be populated with value
		deptartmentOptions = new LinkedHashMap<String, String>();
		deptartmentOptions.put("IT", "IT");
		deptartmentOptions.put("FIN", "Finance");
		deptartmentOptions.put("HR", "HR");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public LinkedHashMap<String, String> getDeptartmentOptions() {
		return deptartmentOptions;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", department=" + department + "]";
	}

}
