<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Details</title>
</head>
<body>
<h1>Gear Technical Forum</h1>
<h1>Answer the Query</h1>
<a href="/UpdateLogin_153168/">Home</a>
<form:form action="updatedetails" modelAttribute="query_master">
<label>Query Id</label>
<form:input type="text" path="query_id" value="${query_master.query_id}"/>
<label>Select Technology</label>
<form:input type="text" path="technology" value="${query_master.technology}"/>
<label>Question</label>
<form:input type="text" path="query" value="${ query_master.query }" />
<label>Question Raised By</label>
<form:input type="text" path="query_raised_by" value="${ query_master.query_raised_by }" />
<label>Solution</label>
<form:input type="text" path="solutions" value="${query_master.solutions}" />
<label>Answered Type</label>
<form:select path="solution_given_by"  >
<option >Please Select</option>
    <option  value="Nikhil">Nikhil</option>
    <option  value="Raveena">Raveena</option>
    <option  value="Suraj">Suraj</option>
  </form:select>
  <input type="submit" value="Update Query"/>
</form:form>
</body>
</html>