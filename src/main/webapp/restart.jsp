<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Game</title>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <meta http-equiv="X-UA-Compatible" content="ie=edge" />
  <link rel="stylesheet" href="css/style.css">
</head>
<body>

<form action="/restart">
  <input type="submit" name="Restart" value="Начать заново" />
</form>

<a>
  Статистика:<br>
  IP address: ${ipAddress}<br>
  Имя пользователя: ${name}<br>
  Количество игр: ${counts}<br>
</a>
</body>
</html>