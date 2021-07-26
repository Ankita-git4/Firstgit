<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p align=center >
<b>Welcome!!This is the Home Page Of Movies Hub</b>
</p>
<form action= "/add" method="post">
<label for="id">Enter Movie ID</label><br>
<input type="text" id="id" name="id"><br>

<label for="mname">Enter Movie Name</label><br>
<input type="text" id="mname" name="name"><br>

<label for="language">Enter Movie Language</label><br>
<input type="text" id="language" name="language"><br>

<label for="director">Enter Movie Director</label><br>
<input type="text" id="director" name="director"><br>

<label for="star">Enter Movie Protagonist</label><br>
<input type="text" id="star" name="star_cast"><br>

<button type="submit">SUBMIT</button>

</form>
</body>
</html>