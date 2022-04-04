<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>MoViE</title>
</head>
<body>
<form action="saveMovie.do" method="get">
<label>Enter Movie Name : </label>
<input type="text" placeholder="Enter movie name" required name="movieName"><br><br>
<label>Enter Actor Name : </label>
<input type="text" placeholder="Enter actor name" required name="actorName"><br><br>
<input type="submit" style="width: 150px; margin-left: 140px" value="SaveMovie">
</form>
</body>
</html>