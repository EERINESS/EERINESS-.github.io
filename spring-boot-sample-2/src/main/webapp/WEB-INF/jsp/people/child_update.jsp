<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<base href="<%=path %>/" />
<title>子女 - 添加</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</head>
<body>
<div align="center">
    <h4>子女 - 添加</h4>
    <form action="child/childAdd" class="form-inline" style="align:center">
        <div class="form-group" style="margin-top:10px">
            <label  class="control-label">子女：</label>   
            <input type="hidden" name="chid" value="${child.chid }" />
            <input type="text" name="chname" value="${child.chname }" class="form-control input-sm" />
            <label   class="control-label">父母：</label>   
            <select name="parents.parid">
                <c:forEach items="${parentss }" var="parents">
                    <c:choose>
                        <c:when test="${parents.parid == child.parents.parid}">
                            <option value="${parents.parid }" selected>${parents.parname }</option>
                        </c:when>
                        <c:otherwise>
                            <option value="${parents.parid }">${parents.parname }</option>
                        </c:otherwise>
                    </c:choose>
                </c:forEach>
            </select>
        </div><br/>
        <button type="submit" class="btn btn-default">提交</button>
    </form>
</div>
</body>
</html>