<%@page import="DumpSaml.SamlToken" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Saml Token ID</title>
</head>
<body>
	<h1>SAML user token ID</h1>
	<p><%=(new SamlToken()).getUserNameData() %></p>
</body>
</html>