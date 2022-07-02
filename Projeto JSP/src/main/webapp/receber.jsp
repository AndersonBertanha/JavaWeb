<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

</body>
</html>

<%
	String nome = request.getParameter("nome");
	int idade =Integer.parseInt (request.getParameter("idade"));
	
	int nota1 =Integer.parseInt (request.getParameter("nota1"));
	int nota2 =Integer.parseInt (request.getParameter("nota2"));
	int nota3 =Integer.parseInt (request.getParameter("nota3"));
	
	int media = (nota1 + nota2 + nota3)/3;
	
	out.print("Seu nome é:" + nome);
	out.print("<br>");
	out.print("Seu idade é:" + idade);
	out.print("<br>");
	out.print("Seu media é:" + media);
	out.print("<br>");

	
	if (media < 7){
		out.print(media+ "Reprovado");
		
	} else {
		out.print(media+ "Aprovado" );
	
	};
	



%>





