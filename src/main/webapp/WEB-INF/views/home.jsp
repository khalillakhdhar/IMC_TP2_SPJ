<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <form method="post" action="imc">
  
      poid<input type="text" class="form-control" pattern="[0-9 ,.]{1,}" required min="10" name="poid">
      taille<input type="text" class="form-control" pattern="[0-9 ,.]{1,}" required min="1" name="taille">
      <input value="calculer IMC" class="btn btn-primary" type="submit">
      </form>
      ${imc }<br>${resultat}
</body>
</html>