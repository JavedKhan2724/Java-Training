<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="LogIn.jsp">
	User Name:
		<input type="text" name="username"/> <br/><br/>
	Password :		
		<input type="password" name="password"/> <br/><br/>
		<input type="submit" value="submit"/>
	</form>
	<%
		if(request.getParameter("username")!=null && request.getParameter("password")!=null){
			String user,pwd;
			user = request.getParameter("username");
			pwd = request.getParameter("password");
			if(user.equals("Infinite") && pwd.equals("Infinite")){
	%>	
		<jsp:forward page="Menu.jsp"/>	
			
	<%
	}else{
	%>
	<%
	out.println("***Invalid Credentials***");
		
			}
		}
	%>		

</body>
</html>