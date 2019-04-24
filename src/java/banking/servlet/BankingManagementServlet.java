package banking.servlet;

import banking.model.BankingManagement;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BankingManagementServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String action = request.getParameter("action");
            boolean actioned = false;
            
            switch (action) {
                case "deposit":
                    String depositAccountId = request.getParameter("depositAccountId");
                    double depositAmount = 0;
                    if (request.getParameter("depositAmount") != null) {
                        depositAmount = Double.parseDouble(request.getParameter("depositAmount"));
                    }
                    actioned = BankingManagement.deposit(depositAccountId, depositAmount);
                    break;
                case "withdraw":
                    String withdrawAccountId = request.getParameter("withdrawAccountId");
                    double withdrawAmount = 0;
                    if (request.getParameter("withdrawAmount") != null) {
                    withdrawAmount = Double.parseDouble(request.getParameter("withdrawAmount"));
                    }
                    actioned = BankingManagement.withdraw(withdrawAccountId, withdrawAmount);
                    break;
                case "transfer":
                    String transferFromAccountId = request.getParameter("transferFromAccountId");
                    String transferToAccountId = request.getParameter("transferToAccountId");
                    double transferAmount = 0;
                    if (request.getParameter("transferAmount") != null) {
                        transferAmount = Double.parseDouble(request.getParameter("transferAmount"));
                    }
                    actioned = BankingManagement.transfer(transferFromAccountId, transferToAccountId, transferAmount);
                    break;
                default:

            }
            
            String actionStatus = actioned ? (action.toUpperCase() + " Completed!") : (action.toUpperCase() + " Failed!");
            
            request.setAttribute("actionStatus", actionStatus);
            getServletContext().getRequestDispatcher("/BankingManagementResult.jsp").forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
