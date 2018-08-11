<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Gear Technical Forum</title>
</head>
<body>
<h1>Gear Technical Forum</h1>
<form:form action="update" modelAttribute="query_master">
<label>Quantity Id</label>
<form:input path="query_id" type="text" id="qid"/>
<input type="submit" value="Search"/>
</form:form>
</body>
</html>