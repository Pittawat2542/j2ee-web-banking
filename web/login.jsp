<%-- 
    Document   : login
    Created on : May 1, 2019, 4:04:58 PM
    Author     : pittawat.pete
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<div class="container mt-5 mb-5">
        <%
        String loggedIn = (String) request.getAttribute("loggedIn");
        if (loggedIn != null && loggedIn.equals("success")) {
            out.println("<div class=\"alert alert-success mt-5\">");
            out.println("<h2>Login Successful</h2>");
            out.println("</div>");
        } else if (loggedIn != null && loggedIn.equals("failed")) {
            out.println("<div class=\"alert alert-danger\">");
            out.println("<h2>Login Failed</h2>");
            out.println("</div>");
        }
    %>
    
    <h1>Login</h1>
    <form action="LoginServlet" method="POST">
        <div class="form-group">
            <label for="accountId">Account ID</label>
            <input type="text" class="form-control" name="accountId" placeholder="Account ID ex. 1234-1234-1234-1234">
        </div>
        <div class="form-group">
            <label for="password">Password</label>
            <input type="password" class="form-control" name="password" placeholder="Password ex. password">
        </div>
        <button type="submit" class="btn btn-primary">Login</button>
    </form>
</div>
<%@include file="components/footer.jsp" %>
