<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.model.Pets,java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>PET STORE HERE....</h1>
<h2>
<%
	Pets pets=(Pets)request.getAttribute("pet");
	out.println(pets.getPetName()+"<br/>");
	out.println(pets.getAge()+"<br/>");
%>

	</li>
	</h2>
</body>
</html>