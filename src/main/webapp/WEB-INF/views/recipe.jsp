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
<%@include file="sidePanel.jsp"%>

<c:forEach items="${recipes}" var="recipe">
<div class="centerX">
    <table>
        <tbody>
        <tr>
            <th colspan="10" style="width: 500px; height:40px; font-size: xx-large" class="center">${recipe.name}</th>
            <th rowspan="3" style="width: 230px; height:290px"> <img src="${recipe.images}" style="width:250px; height:250px;"><br></th>
        </tr>
        <tr>
            <th colspan="10" style="width: 500px; height:100px;">Składniki:<br>
<%--              <c:forEach items="${recipe.recipeIngredients}" var="ingredientsByRecipe">--%>
<%--                    ${ingredientsByRecipe.milliliter}<br></th>--%>
<%--            </c:forEach>--%>
        </tr>
        <tr>
            <th colspan="10" style="width: 500px; height:150px;">Sposób przygotowania:<br>
                    ${recipe.description}<br></th>
        </tr>
        </tbody>
    </table>
</div>
</c:forEach>

</body>
<%@ include file="footer.jsp"%>