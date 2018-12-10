<%@ taglib prefix="spring" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/WEB-INF/views/template/header.jsp"%>

<div class="container-wrapper">

    <div class="container">
        <section>
            <div class="jumbotron">
                <div class="container">
                    <h1>Thank you for your business!</h1>

                    <p>your order will be shipped in two business days!</p>
                </div>
            </div>
        </section>

        <section class="container">

            <p>
                <a href="<spring:url value="/"/>" class="btn btn-default">Ok</a>
            </p>
        </section>
    </div>


</div>


<%@include file="/WEB-INF/views/template/footer.jsp"%>