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
  <form method="get" action="AddAccount.jsp">
  <center>
  First Name:
  <input type="text" name="firstName"><br/><br/>
   Last Name:
  <input type="text" name="lastName"><br/><br/>
  City:
  <select name="city">
  <option value="Lucknow">Lucknow</option>
   <option value="Pune">Pune</option>
    <option value="Patna">Patna</option>
     <option value="Gokharpur">Gokharpur</option>
  </select><br/><br/>
   
  State:
  <select name="state">
  <option value="U.P">U.P.</option>
   <option value="Maharastra">Maharastra</option>
    <option value="Bihar">Bihar</option>
    
  </select><br/><br/>
  Amount:
   <input type="number" name="amount"><br/><br/>
   Check Avail:
   <select name="cheqFacil">
  <option value="Yes">Yes</option>
   <option value="No">No</option>
   
  </select><br/><br/>
  Account Type:
  <select name="accountType">
  <option value="Saving">Saving</option>
   <option value="Current">Current</option>

  </select><br/><br/>
    <input type="submit" value="Insert">
 
  </center>
 
  </form>
  <%
  if(request.getParameter("amount")!=null){
	  BankDAO dao=new BankDAO();
	  %>
	<jsp:useBean id="beanBank" class="infinite.bankproject.Bank" scope="page" />  
	<jsp:setProperty property="*" name="beanBank"/>
	<%=dao.createAccount(beanBank) %>
 <%  }
  %>
</body>
</html>