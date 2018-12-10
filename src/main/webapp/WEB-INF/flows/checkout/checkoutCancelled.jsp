<!DOCTYPE HTML>
<%@ taglib prefix="spring" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/WEB-INF/views/template/header.jsp"%>

<div class="container-wrapper">

    <div class="container">
        <section>
            <div class="jumbotron">
                <div class="container">
                    <h1 class="alert alert-danger">checkout cancelled</h1>

                    <p>your checkout process is cancelled, you may continue shopping.</p>
                </div>
            </div>
        </section>

        <section class="container">

            <p>
                <a href="<spring:url value="/product/productList"/>" class="btn btn-default">products</a>
            </p>
        </section>
    </div>


</div>


<%@include file="/WEB-INF/views/template/footer.jsp"%>
