package com.springmvc.basics;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailConstraintValidator implements ConstraintValidator<EmailValidator, String> {

	private String gmailString;

	@Override
	public void initialize(EmailValidator emailValidator) {
		gmailString = emailValidator.value();
		emailValidator.message();
	}

	// We can place additional error msg in ConstraintValidatorContext
	@Override
	public boolean isValid(String input, ConstraintValidatorContext arg1) {
		boolean result;
		if(input!=null) {
			result=input.contains(gmailString);
		}else {
			// nothing for validation so we can let it pass as it is not required
			result=true;
		}
		return result;
	}

}
