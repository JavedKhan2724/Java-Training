<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="bean" class="infinite.hibjdbc.AgentDAO" />
<table border="3" align="center">
<tr>
<th>Agent Id</th>
<th>Name</th>
<th>City</th>
<th>gender</th>
<th>Marital Status</th>
<th>Premium</th>
</tr>
<c:forEach var="agent" items="${ bean.showAgent()}">
   <tr>
   <td>${agent.agentid }</td>
   <td>${agent.name }</td>
   <td>${agent.city }</td>
   <td>${agent.gender }</td>
   <td>${agent.maritalstatus }</td>
   <td>${agent.premium }</td>
   </tr>
</c:forEach>
</table>
</body>
</html>