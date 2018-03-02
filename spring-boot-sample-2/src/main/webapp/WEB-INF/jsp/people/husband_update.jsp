<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<base href="<%=path %>/" />
<title>丈夫 - 修改</title>
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</head>
<body>
<div align="center">
	<h4>动物 - 修改</h4>
	<form action="people/husbandUpdate" class="form-inline" style="align:center">
		<div class="form-group" style="margin-top:10px">
			<label	class="control-label">丈夫：</label>	
			<input type="hidden" name="hid" value="${husband.hid }" />
			<input type="hidden" name="wife.wid" value="${husband.wife.wid }" />
			<input type="text" name="hname" value="${husband.hname }" class="form-control input-sm" />
		</div><br/>
		<div class="form-group" style="margin-top:10px">
			<label	class="control-label">妻子：</label>	
			<input type="text" name="wife.wname" value="${husband.wife.wname }" class="form-control input-sm" />
		</div><br/>
		<button type="submit" class="btn btn-default">提交</button>
	</form>
</div>
</body>
</html>