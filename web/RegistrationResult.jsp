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
    <p>Name: ${savingAccount.getName()}</p>
    <p>Address: ${savingAccount.getAddress()}</p>
    <p>District: ${savingAccount.getDistrict()}</p>
    <p>Province: ${savingAccount.getProvince()}</p>
    <p>Phone number: ${savingAccount.getPhoneNumber()}</p>
    <p>Balance: ${savingAccount.getBalance()}</p>
</div>

<%@ include file="components/footer.jsp"%>