<%--
  Created by IntelliJ IDEA.
  User: fardadyadegari
  Date: 12/8/2018.
  Time: 4:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@include file="/WEB-INF/views/template/header.jsp"%>


<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Administrator Page</h1>
            <p class="lead">This is the Administrator Page</p>
        </div>

        <c:if test="${pageContext.request.userPrincipal.name!=null}">
             <h2>
                 Welcome:${pageContext.request.userPrincipal.name!=null} | <a href="<c:url
                 value="/j_spring_security_logout"/>">Logout</a>
             </h2>
        </c:if>

        <h3>
            <a href="<c:url value="/admin/productInventory"/>">productInventory</a>
        </h3>

        <p>Here you can view,check and modify the product inventory!</p>

        <br><br>

        <h3>
            <a href="<c:url value="/admin/customer"/>">Customer Management</a>
        </h3>

        <p>Here you can view the customer information</p>


        <%@include file="/WEB-INF/views/template/footer.jsp"%>
