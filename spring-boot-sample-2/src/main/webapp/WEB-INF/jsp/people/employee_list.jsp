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
<title>员工 - 列表</title>
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</head>
<body>
	<div  style="width:600px;margin-top:50px;margin-left:330px">
	  	<a href="javascript:;" class="btn btn-primary" onclick="batchDelete();">批量删除</a>
	 	<a href="people/husband_add" class="btn btn-success">添加</a>
		<table class="table table-striped table-bordered table-hover">
			<thead>
				<tr>
					<td>选择</td>
					<td>编号</td>
					<td>姓名</td>
					<!-- <td>部门</td> -->
					<td>操作</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${employees }" var="employee">
					<tr>
						<td><input type="checkbox" name="ids" value="${employee.eid }" /></td>
						<td>${employee.eid }</td>
						<td>${employee.ename }</td>
						<td>
							<a href="people/husbandDelete/${employee.eid }" class="btn btn-primary">删除</a>
							<a href="people/husband_update/${employee.eid }" class="btn btn-primary">修改</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
<script type="text/javascript">
	function batchDelete(){
		var ids = []; //建立数组
		var i = 0;
		//取得选中复选框中的值
		$('input[name="ids"]:checked').each(function(){
			ids[i] = $(this).val(); //取值
			i++;
		});
		$.ajax({
			url:'people/deleteHusbandBatch',
			type:"post",
			traditional:true, //传数组需要设置该属性
			data:{'ids':ids},
			success:function(data){
				alert("删除成功");
				location.reload();
			},error:function(XMLHttpRequest,textStates){
				alert("删除失败");
			}	
		});
	}

</script>

</html>