<%@ taglib prefix="spring" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/WEB-INF/views/template/header.jsp"%>

<div class="container-wrapper">

    <div class="container">
        <section>
            <div class="jumbotron">
                <div class="container">
                    <p>Customer registered successfully</p>
                </div>
            </div>
        </section>

        <section class="container">

            <p>
                <a href="<spring:url value="/product/productList "/>" class="btn btn-default">Products</a>
            </p>
        </section>
    </div>


</div>


<%@include file="/WEB-INF/views/template/footer.jsp"%>
