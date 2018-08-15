<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ include file="./common/header.jsp" %>
<html>
<body>
<h2>Hello example!</h2>
<p>
	<form action="./add" method="POST">
	<p>Username:<input type="text" name="username" /></p>
	<p>Password:<input type="text" name="password" /></p>
	<p>Age:<input type="text" name="age" /></p>
	<input type="submit" value="submit"/>
	</form>
</p>
<p>当前数列表：</p>

</body>
</html>
