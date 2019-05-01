<%-- 
    Document   : navbar
    Created on : Apr 20, 2019, 11:27:45 AM
    Author     : pittawat.pete
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <a class="navbar-brand" href="/Banking">Bank</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item">
                <a class="nav-link" href="${request.getAttribute("javax.servlet.forward.request_uri")}BankingManagementPage.jsp">Management</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="${request.getAttribute("javax.servlet.forward.request_uri")}AllAccounts.jsp">All Accounts</a>
            </li>
            <li class="nav-item">
                <!--<a class="nav-link" href="${request.getAttribute("javax.servlet.forward.request_uri")}SearchAccount.jsp">Search Account</a>-->
                <a class="nav-link" href="SearchAccountServlet">Search Account</a>
            </li>
        </ul>
        <%
            if (request.getSession().getAttribute("accountId") != null) {
                out.println("<a class=\"nav-link text-warning\" href=\"DashboardServlet\">Dashboard</a>");
                out.println("<form action=\"LogoutServlet\" method=\"POST\"><button class=\"btn btn-danger\">Logout</button></form>");
            } else {
                out.println("<a class=\"nav-link text-warning\" href=\"register.jsp\">Register</a>");
                out.println("<a class=\"nav-link text-warning\" href=\"login.jsp\">Login</a>");
            }
        %>
    </div>
</nav>