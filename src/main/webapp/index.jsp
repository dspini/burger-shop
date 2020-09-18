<%@ page import="model.Soda" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%-- Let's take a look at an instance variable, and like servlet variables, this will persist between page loads --%>
<%! int counter = 0; %>

<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Burgers 'R Us"/>
    </jsp:include>
</head>
<body>
<jsp:include page="partials/navbar.jsp"/>
<div class="container">
    <h1>Welcome to Burgers 'r Us!</h1>
    <p>Currently <%= counter %> million burgers sold</p>

    <%-- Let's take a look at some implicit objects, available to us with JSP --%>

    <%-- Use JSTL to iterate through our list of burgers --%>
    <h2>Here is our menu!</h2>

    <div class="list-group">
        <ul><!-- Start of our Burger List -->
            <%-- Loop through the "allBurgers" attribute to display each burger --%>
            <c:forEach var="burger" items="${allBurgers}">
                <li class="list-group-item list-group-item-action"><strong>${burger.burgerName}</strong></li>
                <div class="list-group">
                    <ul>
                        <c:forEach var="ingredient" items="${burger.ingredients}">
                            <li class="list-group-item list-group-item-action"><strong>${ingredient.name}</strong> -
                                (x${ingredient.quantity})
                            </li>
                        </c:forEach>
                    </ul>
                </div>
            </c:forEach>
        </ul><!-- End of our Burger List -->
    </div>

    <h2>Here are our sodas!</h2>

    <div class="list-group">
        <ul><!-- Start of our Sodas List -->

            <c:forEach var="soda" items="${allSodas}" varStatus="loop" >
                <li class="list-group-item list-group-item-action">
                    <strong>
                            ${soda.name}
                    </strong> - ${cokeSizes[loop.index]}
                </li>

            </c:forEach>

        </ul><!--END of the Sodas List-->
    </div>

    <!--List all the sodas we currently have -->

</div>


<%-- Now let's run some arbitrary Java code, to increment the counter by 1 every time we reload this page --%>
<% counter += 1; %>
<jsp:include page="partials/scripts.jsp"/>
</body>
</html>
