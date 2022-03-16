<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.model.PetStore,java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	List<PetStore> petstore=(List)request.getAttribute("petstore");
for(PetStore p:petstore)
{%>
	<li>
	<%
	out.println(p.getStoreName()+"  --");
	out.println(p.getStoreAddress());
}%>
</li>
</body>
</html>