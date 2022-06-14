<%--
  Created by IntelliJ IDEA.
  User: kinga
  Date: 07.06.2022
  Time: 06:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="headerUser.jsp"%>

<c:forEach items="${equipments}" var="equipment">
    <div class="centerX">
        <table>
            <tbody>
            <tr>
                <th colspan="10" style="width: 500px; height:40px; font-size: xx-large" class="center">${equipment.name}</th>
            </tr>
            <tr>
                <th colspan="10" style="width: 500px; height:100px;">Opis:<br>
                        ${equipment.description}<br></th>
            </tr>
            </tbody>
        </table>
    </div>
</c:forEach>

<%@ include file="footer.jsp"%>