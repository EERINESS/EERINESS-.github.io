<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<base href="<%=path %>/" />
<title>父母 - 列表</title>
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</head>
<body>
	<div  style="width:600px;margin-top:50px;margin-left:330px">
	  	<a href="javascript:;" class="btn btn-primary" onclick="batchDelete();">批量删除</a>
	 	<a href="parents/parents_add" class="btn btn-success">添加</a>
		<table class="table table-striped table-bordered table-hover">
			<thead>
				<tr>
					<td>选择</td>
					<td>编号</td>
					<td>父母</td>
					<td>操作</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${parentss }" var="parents">
					<tr>
						<td><input type="checkbox" name="ids" value="${parents.parid }" /></td>
						<td>${parents.parid }</td>
						<td>${parents.parname }</td>
						<td>
							<a href="parents/parentsDelete/${parents.parid }" class="btn btn-primary">删除</a>
							<a href="parents/parents_update/${parents.parid }" class="btn btn-primary">修改</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>