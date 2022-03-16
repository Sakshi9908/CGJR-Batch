<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.model.Customer"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		Customer customer =(Customer)request.getAttribute("newcustomer");
		out.println(customer.getCustomerName()+ "added.");
	%>
</body>
</html>