<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int nun =Integer.parseInt (request.getParameter("numero"));

int restoDivisao= nun%2;
if (restoDivisao == 0){
	
	out.print(" Numero par");
} else{
	out.print("Numero Impar");
};


%>
</body>
</html>


