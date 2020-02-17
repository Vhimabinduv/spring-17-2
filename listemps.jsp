<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table align="center" border="1px">
	    <tr>
	       <th>ID</th>
	       <th>FIRST NAME</th>	       
	       <th>AGE</th>
	    </tr>
	    <c:forEach var="emp" items="${list}">
	    	<tr>
	    	   <td>${emp.eid}</td>	          
	           <td>${emp.ename}</td>
	           <td>${emp.eage}</td>
           </tr>
	    </c:forEach>    
	</table>
</body>
</html>