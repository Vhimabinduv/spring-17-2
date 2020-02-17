<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<a href = "index.jsp">HOME</a><br>
<body>
<form:form action="saveEmp" method="post" modelAttribute="emp">
<table align = "center" border="3px">
	<tr>
		<td>EMPLOYEE ID</td>
		<td><form:input path="eid"/></td>
	</tr>
	<tr>
		<td>FULL NAME</td>
		<td><form:input path="ename"/></td>
	</tr>
	
	<tr>
		<td>AGE</td>
		<td><form:input path="eage"/></td>
	</tr>
	<tr>
		<td><input type="submit" value="SUBMIT" /></td>
	</tr>
</table>

</form:form>
</body>
</html>