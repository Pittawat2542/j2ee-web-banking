<%-- 
    Document   : register.jsp
    Created on : Apr 20, 2019, 11:33:05 AM
    Author     : pittawat.pete
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="components/header.jsp"%>

<section class="container mt-5 mb-5">
    <h1>Register Page</h1>
    <form action="RegisterServlet" method="POST">
        <div class="form-group">
            <label for="firstName">First Name</label>
            <input type="text" class="form-control" id="firstName" name="firstName" placeholder="First Name ex. John">
        </div>
        <div class="form-group">
            <label for="lastName">Last Name</label>
            <input type="text" class="form-control" id="lastName" name="lastName" placeholder="Last Name ex. Doe">
        </div>
        <button type="submit" class="btn btn-primary">Create New Account</button>
    </form>
</section>

<%@include file="components/footer.jsp"%>