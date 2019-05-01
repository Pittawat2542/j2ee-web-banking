<%-- 
    Document   : BankingManagementPage
    Created on : Apr 20, 2019, 11:34:14 AM
    Author     : pittawat.pete
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="components/header.jsp"%>

<div class="container mt-5 mb-5">
    <h1>Banking Management Page</h1>
    <hr>
    <h2>Deposit</h2>
    <form action="BankingManagementServlet" method="POST">
        <div class="form-group">
            <label for="depositAccountId">Account ID</label>
            <input type="text" class="form-control" id="depositAccountId" name="depositAccountId" placeholder="Account ID">
        </div>
        <div class="form-group">
            <label for="depositAmount">Amount</label>
            <input type="numeric" class="form-control" id="depositAmount" name="depositAmount" placeholder="Amount">
        </div>
        <input type="hidden" name="action" value="deposit">
        <button type="submit" class="btn btn-primary">Deposit</button>
    </form>
    <hr>
    <h2>Withdraw</h2>
    <form action="BankingManagementServlet" method="POST">
        <div class="form-group">
            <label for="withdrawAccountId">Account ID</label>
            <input type="text" class="form-control" id="withdrawAccountId" name="withdrawAccountId" placeholder="Account ID">
        </div>
        <div class="form-group">
            <label for="withdrawAmount">Amount</label>
            <input type="numeric" class="form-control" id="withdrawAmount" name="withdrawAmount" placeholder="Amount">
        </div>
        <input type="hidden" name="action" value="withdraw">
        <button type="submit" class="btn btn-primary">Withdraw</button>
    </form>
    <hr>
    <h2>Transfer</h2>
    <form action="BankingManagementServlet" method="POST">
        <div class="form-group">
            <label for="transferFromAccountId">From: Account ID</label>
            <input type="text" class="form-control" id="transferFromAccountId" name="transferFromAccountId" placeholder="From Account ID">
        </div>
        <div class="form-group">
            <label for="transferToAccountId">To: Account ID</label>
            <input type="text" class="form-control" id="transferToAccountId" name="transferToAccountId" placeholder="To Account ID">
        </div>
        <div class="form-group">
            <label for="transferAmount">Amount</label>
            <input type="numeric" class="form-control" id="transferAmount" name="transferAmount" placeholder="Amount">
        </div>
        <input type="hidden" name="action" value="transfer">
        <button type="submit" class="btn btn-primary">Transfer</button>
    </form>
    <hr>
    <h2>Delete Account</h2>
    <form action="BankingManagementServlet" method="POST">
        <div class="form-group">
            <label for="depositAccountId">Account ID</label>
            <input type="text" class="form-control" id="deleteAccountId" name="deleteAccountId" placeholder="Account ID">
        </div>
        <input type="hidden" name="action" value="delete">
        <button type="submit" class="btn btn-danger">Delete Account</button>
    </form>
</div>

<%@include file="components/footer.jsp"%>
