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
<title>动物 - 修改</title>
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</head>
<body>
<div align="center">
	<h4>动物 - 修改</h4>
	<form action="animal/animalUpdate" class="form-inline" style="align:center">
		<div class="form-group" style="margin-top:10px">
			<label	class="control-label">姓名：</label>	
			<input type="hidden" name="anId" value="${animal.anId }" />
			<input type="text" name="anName" value="${animal.anName }" class="form-control input-sm" />
		</div><br/>
		<div class="form-group" style="margin-top:10px">
			<label	class="control-label">类型：</label>	
			<input type="text" name="anType" value="${animal.anType }" class="form-control input-sm" />
		</div><br/>
		<div class="form-group" style="margin-top:10px">
			<label	class="control-label">年龄：</label>	
			<input type="text" name="anAge" value="${animal.anAge }"  class="form-control input-sm" />
		</div><br/>
		<div class="radio" style="margin-top:10px">
		<label	class="control-label">性别：</label>	
		 <label>
			<input type="radio" name="anSex" value="男" <c:if test="${animal.anSex=='男'}">checked</c:if>> 男
		 </label>
		 <label>
			<input type="radio" name="anSex" value="女" <c:if test="${animal.anSex=='女' }">checked</c:if>>女
		 </label>
	   </div><br/>
		<div class="form-group" style="margin-top:10px;margin-bottom:10px">
			<label	class="control-label">生日：</label>	
			<input type="text" name="anBirthday" value="${animal.anBirthday }" class="form-control input-sm" />
		</div><br/>
		<button type="submit" class="btn btn-default">提交</button>
	</form>
</div>
</body>
</html>