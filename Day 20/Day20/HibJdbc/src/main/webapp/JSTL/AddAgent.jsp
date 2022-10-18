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
<form method="get" action="AddAgent.jsp">
Agent Name:
<input type="text" name="name"><br/><br/>
City:
<input type="text" name="city"><br/><br/>
Gender:
<input type="radio" name="gender" value="MALE" />Male
<input type="radio" name="gender" value="FEMALE" />FeMale

Marital Status:
<input type="text" name="maritalstatus"><br/><br/>
Premium:
<input type="text" name="premium"><br/><br/>
<input type="submit" value="Insert">

</form>
 <c:if test="${param.premium!=null }">
 <jsp:useBean id="agent" class="infinite.hibjdbc.Agent" />
 <c:when test="${agent.gender == 'MALE'}">
  <jsp:setProperty property="gender" name="agent"/>
 </c:when>
 <c:when test="${agent.gender == 'FEMALE'}">
  <jsp:setProperty property="gender" name="agent"/>
 </c:when>
 <jsp:setProperty property="*" name="agent"/>
 <jsp:useBean id="dao" class="infinite.hibjdbc.AgentDAO" scope="page" />
 <c:out value="${dao.addAgent(agent) }"></c:out>
 </c:if>
</body>
</html>