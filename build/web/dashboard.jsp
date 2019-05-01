<%-- 
    Document   : dashboard
    Created on : May 1, 2019, 4:41:38 PM
    Author     : pittawat.pete
--%>

<%@page import="banking.bankaccount.BankAccount"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="components/header.jsp" %>
<div class="container mt-5 mb-5">
    <h1>Welcome, <%= request.getSession().getAttribute("accountId")%></h1>

    <%
        BankAccount loggedInAccount = (BankAccount) request.getAttribute("loggedInAccount");
        if (loggedInAccount != null) {
            out.println("<div class=\"alert alert-primary mt-3\" role=\"alert\">");
            out.println("<p><strong>Account ID</strong>: " + loggedInAccount.getAccountId() + "</p>");
            out.println("<p><strong>Name</strong>: " + loggedInAccount.getName() + "</p>");
            out.println("<p><strong>Address</strong>: " + loggedInAccount.getAddress() + "</p>");
            out.println("<p><strong>District</strong>: " + loggedInAccount.getDistrict() + "</p>");
            out.println("<p><strong>Province</strong>: " + loggedInAccount.getProvince() + "</p>");
            out.println("<p><strong>Phone number</strong> " + loggedInAccount.getPhoneNumber() + "</p>");
            out.println("<p><strong>Balance</strong> " + loggedInAccount.getBalance() + "</p>");
            out.println("</div>");
        }
    %>
</div>
<%@include file="components/footer.jsp" %>