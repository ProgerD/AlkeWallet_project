package com.alkewallet.controller;

import com.alkewallet.service.AccountService;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class AccountController extends HttpServlet {
    private AccountService accountService;

    @Override
    public void init() throws ServletException {
        accountService = new AccountService();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");

        if ("deposit".equals(action)) {
            request.getRequestDispatcher("views/deposit.jsp").forward(request, response);
        } else if ("withdraw".equals(action)) {
            request.getRequestDispatcher("views/withdraw.jsp").forward(request, response);
        } else {
            request.setAttribute("balance", accountService.getBalance());
            request.getRequestDispatcher("views/index.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");

        if ("deposit".equals(action)) {
            double amount = Double.parseDouble(request.getParameter("amount"));
            accountService.deposit(amount);
        } else if ("withdraw".equals(action)) {
            double amount = Double.parseDouble(request.getParameter("amount"));
            accountService.withdraw(amount);
        }
        response.sendRedirect("AccountController");
    }
}
