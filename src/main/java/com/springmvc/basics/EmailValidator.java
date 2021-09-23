package com.springmvc.basics;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = EmailConstraintValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface EmailValidator {

	// defining default ending value
	public String value() default "@gmail.com";

	// defining default error value
	public String message() default "Only gmail addresses are allowed";

	// defining default groups
	public Class<?>[] groups() default {};

	// defining default payloads
	public Class<? extends Payload>[] payload() default {};
}
