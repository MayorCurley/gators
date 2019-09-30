<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head><%@ page isELIgnored="false" %>
<meta charset="ISO-8859-1">
<title>Spring 5 MVC - Player Example</title>
</head>
   <body>
      <h2>${player.firstName} ${player.lastName}</h2>
      <h4>Player Overall Madded Rating : ${player.overall}</h4>
   </body>
</html>