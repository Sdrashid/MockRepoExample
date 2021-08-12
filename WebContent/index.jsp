<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@page import="java.util.Map"%>
<%@page import="org.mock.mockitoweb.WebService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Index</title>
</head>
<body>
<h1>Hello World..!!!</h1>
<% WebService service = new WebService(); %>
<h2>Square of 9 is <%= service.getSquare(9) %></h2>
<h2>Employee with age less or equal to 30</h2>
<% Map<String,Long> employees = service.getEmployeeNameAsPerAge(30l); %>
<% for(String name: employees.keySet()){
	Long age = employees.get(name);
	String data = name + " | " + age;
	%>
	<h3><%=data %></h3>
	<% 
}%>
</body>
</html>