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
                    ${recipe.recipeIngredients}<br></th>
        </tr>
        <tr>
            <th colspan="10" style="width: 500px; height:150px;">Sposób przygotowania:<br>
                    ${recipe.description}<br></th>
        </tr>
        </tbody>
    </table>
</div>
</c:forEach>


<%--<div class="centerX">--%>
<%--    <table>--%>
<%--        <tbody>--%>
<%--        <tr>--%>
<%--            <th colspan="10" style="width: 500px; height:40px;">Shot Kamikaze</th>--%>
<%--            <th rowspan="3" style="width: 230px; height:290px"> <img src="images/shot-kamikaze.jpg" style="width:250px; height:250px;"><br></th>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <th colspan="10" style="width: 500px; height:100px;">Składniki:<br>--%>
<%--                20 ml wódki<br>--%>
<%--                10 ml triple sec<br>--%>
<%--                10 ml soku z cytryny.<br></th>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <th colspan="10" style="width: 500px; height:150px;">Sposób przygotowania:<br>--%>
<%--                Wszystkie wymienione składniki należy wstrząsnąć w shakerze, po czym rozlać do kieliszków.<br></th>--%>
<%--        </tr>--%>
<%--        </tbody>--%>
<%--    </table>--%>
<%--</div>--%>

<%--<div class="centerX">--%>
<%--    <table>--%>
<%--        <tbody>--%>
<%--        <tr>--%>
<%--            <th colspan="10" style="width: 500px; height:40px;">Cuba Libre</th>--%>
<%--            <th rowspan="3" style="width: 230px; height:290px"> <img src="images/cuba-libre.jpg" style="width:250px; height:250px;"><br></th>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <th colspan="10" style="width: 500px; height:100px;">Składniki:<br>--%>
<%--                rum - 50 ml<br>--%>
<%--                Coca-Cola - 120 ml<br>--%>
<%--                sok z limonki - 10 ml<br>--%>
<%--                kostki lodu<br></th>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <th colspan="10" style="width: 500px; height:150px;">Sposób przygotowania:<br>--%>
<%--                Do szklanki Old Fashioned wypełnionej kostkami lodu wlewamy wszystkie składniki i mieszamy.--%>
<%--                Sok z limonki możemy wycisnąć mudlerem podobnie jak w Mohito.<br>--%>
<%--                Do szklanki możemy również wrzucić ćwiartkę limonki do ozdoby.<br></th>--%>
<%--        </tr>--%>
<%--        </tbody>--%>
<%--    </table>--%>
<%--</div>--%>

</body>

<%@ include file="footer.jsp"%>