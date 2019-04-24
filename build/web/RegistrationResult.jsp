<%-- 
    Document   : RegistrationResult
    Created on : Apr 20, 2019, 4:04:59 PM
    Author     : pittawat.pete
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="components/header.jsp"%>

<div class="container mt-3">
    <h1>Account Created Successfully!</h1>
    <p>Account ID: ${savingAccount.getAccountId()}</p>
    <p>First Name: ${savingAccount.getFirstName()}</p>
    <p>Last Name: ${savingAccount.getLastName()}</p>
    <p>Balance: ${savingAccount.getBalance()}</p>
</div>

<%@ include file="components/footer.jsp"%>