<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<style>
.error {
	color: red;
}
</style>

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

		<form:errors path="lastName" cssClass="error"></form:errors>
		<br>
		<br>
Select department: <form:select path="department">
			<!--In code below getDeptartmentOptions will be called with values as labels on page  -->
			<form:options items="${employee.deptartmentOptions}" />
		</form:select>
		<br>
		<br>
Where do you live?
	<form:radiobutton path="livingAddress" value="India" label="India" />
		<br>
		<form:radiobutton path="livingAddress" value="Outside India"
			label="Outside India" />
		<!--We can also use form:radiobuttons path="livingAddress" items="${employee.livingAddress}" and populate LinkeHashMap in constructor like in case of drop down list instead of above 2 lines -->
		<br>
		<br>
In which states is employee comfortable to work with?
<form:checkbox path="comfortableStates" value="MH" label="Maharashtra" />
		<form:checkbox path="comfortableStates" value="MP"
			label="Madhya Pradesh" />
		<form:checkbox path="comfortableStates" value="AP"
			label="Andra Pradesh" />
		<br>
		<br>
		<input type="submit" value="Submit">
	</form:form>

</body>
</html>