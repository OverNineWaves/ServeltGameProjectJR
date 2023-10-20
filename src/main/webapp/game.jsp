<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Game</title>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <meta http-equiv="X-UA-Compatible" content="ie=edge" />
  <link rel="stylesheet" href="css/style.css">
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>

<c:set var="win" value="win"/>
<c:set var="lose" value="lose"/>


<br>
<a>
  ${question}
</a>
<br>
<a>
  ${choice}
</a>

<br><br><br><br>

  <c:if test="${buttonOne != win && buttonOne != lose}">

    <a href="#" class="buttonG" onclick="window.location='logic?button=${buttonOne}'">${buttonOne}</a>
    <a href="#" class="buttonR" onclick="window.location='logic?button=${buttonTwo}'">${buttonTwo}</a>
  </c:if>

<br><br><br><br>
<input type="button" value="Закончить игру" onclick="window.location='restart.jsp'" >

<br>
</body>
</html>