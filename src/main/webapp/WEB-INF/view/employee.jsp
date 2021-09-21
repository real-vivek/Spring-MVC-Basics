<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<h1>Welcome to Employee Management System</h1>
	<h2></h2>
	<form:form action="processEmployee" modelAttribute="employee">
		<!-- Automatically getter and setter methods will be called and populated for given path -->
		<!-- Getter will be called once page is populated and setter is called once submit is clicked -->
Employee First Name: <form:input
			placeholder="Enter first name of Employee" path="firstName" />
		<br>
		<br>
Employee Last Name: <form:input
			placeholder="Enter last name of Employee" path="lastName" />
		<br>
		<br>
Select department: <form:select path="department">
			<form:option value="IT" label="IT" />
			<form:option value="Finance" label="Finance" />
			<form:option value="HR" label="HR" />
		</form:select>

		<br>
		<br>
		<input type="submit" value="Submit">
	</form:form>

</body>
</html>