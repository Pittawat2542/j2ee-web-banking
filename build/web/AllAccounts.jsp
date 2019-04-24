<%-- 
    Document   : AllAccounts
    Created on : Apr 20, 2019, 3:55:13 PM
    Author     : pittawat.pete
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.Vector, banking.model.Member, banking.bankaccount.SavingAccount" %>
<%@ include file="components/header.jsp"%>
      <% 
    Vector allAccounts = Member.getAllMembers(); 
    if (allAccounts.size() > 0) {
        out.println("<h2 class=\"text-center mt-3 mb-3\">All Accounts</h2><hr>");
        out.println("<table class=\"table\"><thead><tr class=\"table-info\"><th scope=\"col\">#</th><th scope=\"col\">Account ID</th><th scope=\"col\">First Name</th><th scope=\"col\">Last Name</th><th scope=\"col\">Balance</th></tr></thead><tbody>");
            for (int i = 0; i < allAccounts.size(); i++) {
            SavingAccount savingAccount = (SavingAccount) allAccounts.get(i);
            out.println("<tr>");
            out.println("<td>");
            out.println((i + 1));
            out.println("</td>");
            out.println("<td>");
            out.println(savingAccount.getAccountId());
            out.println("</td>");
                        out.println("<td>");
            out.println(savingAccount.getFirstName());
            out.println("</td>");
                        out.println("<td>");
            out.println(savingAccount.getLastName());
            out.println("</td>");
                        out.println("<td>");
            out.println(savingAccount.getBalance());
            out.println("</td>");
            out.println("</tr>");
        } 
            out.println("</tbody></table>");
    } else {
        out.println("<h2 class=\"text-center mt-3 text-danger\">No Accounts!</h2>");
}
%>

<%@ include file="components/footer.jsp"%>