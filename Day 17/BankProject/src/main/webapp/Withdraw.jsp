<%@page import="infinite.bankproject.BankDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form  method="get" action="Withdraw.jsp">
 <center>
  Account Number:
  <input type="number" name="accountno" /><br/><br/>
  Withdraw Amount:
  <input type="number" name="widamt" /><br/><br/>
  <input type="submit" value="Withdraw">
 </center>

</form>
<%
 if(request.getParameter("widamt")!=null){
	 BankDAO dao=new BankDAO();
 %>
 <jsp:useBean id="beanBank" class="infinite.bankproject.Bank" scope="page" />
 <jsp:setProperty property="accountno" name="beanBank"/>
 <jsp:setProperty property="widamt" name="beanBank"/>
 <%=dao.withdrawAccount(beanBank.getAccountno(),beanBank.getWidamt())%>
 
 <%} %>
</body>
</html>