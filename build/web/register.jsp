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
            <label for="name">Name</label>
            <input type="text" class="form-control" id="name" name="name" placeholder="Name ex. John Doe">
        </div>
        <div class="form-group">
            <label for="address">Address</label>
            <input type="text" class="form-control" id="address" name="address" placeholder="Address ex. 123 Street.">
        </div>
        <div class="form-group">
            <label for="district">District</label>
            <input type="text" class="form-control" id="district" name="district" placeholder="District ex. Thung Khru">
        </div>
        <div class="form-group">
            <label for="province">Province</label>
            <input type="text" class="form-control" id="province" name="province" placeholder="Province ex. Bangkok">
        </div>
        <div class="form-group">
            <label for="phoneNumber">Phone number</label>
            <input type="tel" class="form-control" id="phoneNumber" name="phoneNumber" placeholder="phoneNumber ex. 0812345678">
        </div>
        <button type="submit" class="btn btn-primary">Create New Account</button>
    </form>
</section>

<%@include file="components/footer.jsp"%>