<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="css/style.css">
    <title>Приветствую пользователь</title>
</head>
<body>

    <h1>Введение</h1>
        <br>
    <h1>Чтобы начать игру нужно указать имя и нажать клавишу "Enter"</h1>
    <br><br>

<form action="/logic" method="post">
    <input type="input" class="type-1" name="name" id="name" placeholder="Указать имя:" required/>
</form>

</body>
</html>