<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="/login" method="post">
<input type="text" name="username">
<input type="text" name="password">
<input type="text" name="_csrf" value="${_csrf.token}"> 
<button>로그인</button>
</form>

</body>
</html>