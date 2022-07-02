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
int tab =Integer.parseInt (request.getParameter("tabuada"));
int rep =Integer.parseInt (request.getParameter("repeticao"));



String mensagem = "";

for(int i=1; i<=rep; i++){
	mensagem = tab +" x " + i + " = " +(tab*i)+  " <br>";
	
	out.print(mensagem);
	
};


%>
</body>
</html>