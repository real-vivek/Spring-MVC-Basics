package com.springmvc.basics;

import java.util.Arrays;
import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Employee {

	private String firstName;

	@NotNull
	@Size(min = 1, max = 100, message = "Last Name is Required")// if message attribute is not present then default msg is: size must be between 1 and 100
	private String lastName;
	private String department;
	private LinkedHashMap<String, String> deptartmentOptions;
	private String livingAddress;
	private String[] comfortableStates;
	@Min(value = 18, message = "Min age must be 18")
	@Max(value = 60, message = "Max age must be 60")
	private int age;

	public Employee() {
		// department will be populated with the key and label on jsp page will be
		// populated with value
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

	public String getLivingAddress() {
		return livingAddress;
	}

	public void setLivingAddress(String livingAddress) {
		this.livingAddress = livingAddress;
	}

	public String[] getComfortableStates() {
		return comfortableStates;
	}

	public void setComfortableStates(String[] comfortableStates) {
		this.comfortableStates = comfortableStates;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", department=" + department
				+ ", livingAddress=" + livingAddress + ", comfortableStates=" + Arrays.toString(comfortableStates)
				+ ", age=" + age + "]";
	}

}
