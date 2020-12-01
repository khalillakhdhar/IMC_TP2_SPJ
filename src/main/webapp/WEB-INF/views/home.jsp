<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <form method="post" action="imc">
      poid<input type="text" required min="10" name="poid">
      taille<input type="text" required min="1" name="taille">
      <input value="calculer IMC" type="submit">
      </form>
</body>
</html>