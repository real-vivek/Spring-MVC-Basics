<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<h2>Employee with ${employee.lastName} and ${employee.lastName}
		confirmed!!</h2>

	<h2>Employee is comfortable to work in following locations:</h2>
	<ul>
		<c:forEach var="state" items="${employee.comfortableStates}">

			<li>${state}</li>

		</c:forEach>
	</ul>

	<h2>Age of employee is: ${employee.age}</h2>
	<h2>Email Address of employee is: ${employee.email}</h2>
</body>
</html>