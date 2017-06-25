<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<title>	自己管理サイト</title>
</head>
<body>
<form action="/qas/init/">
<input type="submit" value="問題登録" name="rejister">
<input type="submit" value="問題演習" name="practice">
</form>
</body>
</html>