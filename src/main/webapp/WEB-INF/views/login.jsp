<%--
  Created by IntelliJ IDEA.
  User: kinga
  Date: 02.06.2022
  Time: 16:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="header.jsp" %>


<script>
    if (confirm('Czy masz ukończone 18 lat?')) {
        alert('Zapraszamy :)');
    } else {
        alert('Musisz jeszcze poczekać mordeczko');
    }
</script>

<section class="dashboard-section">
    <div class="container pt-4 pb-4">
        <div class="border-dashed view-height">
            <div class="container w-25">
                <form method="post" action="/dashboard" class="padding-small text-center">
                    <h1 class="text-color-darker">Logowanie</h1>
                    <div><label> User Name : <input type="text" name="username"/> </label></div>
                    <div><label> Password: <input type="password" name="password" id="myInput"/> </label>
                        <script>
                            function myFunction() {
                                const x = document.getElementById("myInput");
                                if (x.type === "password") {
                                    x.type = "text";
                                } else {
                                    x.type = "password";
                                }
                            }
                        </script></div>
                    <input type="checkbox" onclick="myFunction()">Show Password
                    <div><input type="submit" value="Sign In"/></div>
                    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                </form>
            </div>
        </div>
    </div>
</section>


<%@ include file="footer.jsp"%>