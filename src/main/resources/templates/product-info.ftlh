<!DOCTYPE html>
<html>
<head>
    <title>SellStore</title>
</head>
<body>
<h1>SellStore</h1>
<hr>
<h4> Подробная информация о товаре: </h4>
<b> Название товара: </b>${product.title}<br>
<b> Описание товара: </b>${product.description}<br>
<b> Цена товара: </b>${product.price}<br>
<b> Город товара: </b>${product.city}<br>
<b> Автор: </b>${product.title}<br>
<hr>
<h3>Создать новый товар</h3>
<form action="/product/delete/${product.id}" method="post">
    <input type="submit" value=" Удалить  товар">
</form>
</body>
</html>