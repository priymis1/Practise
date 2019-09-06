<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>student data</title>
</head>
<body>

Student data... <br/>
<hr>
<br/>
Student Name : ${param.studentName}
Email : ${param.email}

<br/>
</br>
<%= request.getAttribute("objectForm").toString()%>



</body>
</html>