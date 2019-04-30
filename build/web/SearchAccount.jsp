<%-- 
    Document   : SearchAccount
    Created on : Apr 30, 2019, 7:20:19 PM
    Author     : pittawat.pete
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="banking.bankaccount.BankAccount"%>
<%@include file="components/header.jsp" %>

<section class="container mt-5 mb-5">
    <h1>Search Account</h1>
    <form action="SearchAccountServlet" method="POST">
        <div class="form-group">
            <label for="accountId">Account ID</label>
            <input type="number" class="form-control" id="accountId" name="accountId" placeholder="Account ID">
        </div>
        <button type="submit" class="btn btn-primary">Search</button>
    </form>
    
    <%
        BankAccount bankAccount = (BankAccount) request.getAttribute("account");
        if (bankAccount != null) {
            out.println("<div class=\"alert alert-success mt-3\" role=\"alert\">");
            out.println("<h1>Result</h1><hr>");
            out.println("<p><strong>Account ID</strong>: " + bankAccount.getAccountId() + "</p>");
            out.println("<p><strong>Name</strong>: " + bankAccount.getName()+ "</p>");
            out.println("<p><strong>Address</strong>: " + bankAccount.getAddress()+ "</p>");
            out.println("<p><strong>District</strong>: " + bankAccount.getDistrict()+ "</p>");
            out.println("<p><strong>Province</strong>: " + bankAccount.getProvince()+ "</p>");
            out.println("<p><strong>Phone number</strong> " + bankAccount.getPhoneNumber()+ "</p>");
            out.println("<p><strong>Balance</strong> " + bankAccount.getBalance()+ "</p>");
            out.println("</div>");
        }
    %>
</section>

<%@include file="components/footer.jsp" %>

