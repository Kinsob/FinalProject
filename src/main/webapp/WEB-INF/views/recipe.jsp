<%--
  Created by IntelliJ IDEA.
  User: kinga
  Date: 07.06.2022
  Time: 06:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="headerUser.jsp"%>
<body>

<c:forEach items="${all}" var="ingredients">
</c:forEach>

</body>
<%@include file="sidePanel.jsp"%>

<%@ include file="footer.jsp"%>