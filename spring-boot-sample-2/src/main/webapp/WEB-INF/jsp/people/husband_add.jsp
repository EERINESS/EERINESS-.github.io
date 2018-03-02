<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<base href="<%=path %>/" />
<title>丈夫 - 添加</title>
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</head>
<body>
<div align="center">
	<h4>动物 - 添加</h4>
	<form action="people/husbandAdd" class="form-inline" style="align:center">
		<div class="form-group" style="margin-top:10px">
			<label	class="control-label">丈夫：</label>	
			<input type="text" name="hname" class="form-control input-sm" />
		</div><br/>
		<div class="form-group" style="margin-top:10px">
			<label	class="control-label">妻子：</label>	
			<input type="text" name="wife.wname" class="form-control input-sm" />
		</div><br/>
		<button type="submit" class="btn btn-default">提交</button>
	</form>
</div>
</body>
</html>