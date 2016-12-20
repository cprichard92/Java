package com.expense.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.expense.beans.Reimbursment;
import com.expense.beans.Users;
import com.expense.dao.ExpenseDAO;

public class LoginController extends HttpServlet{

	private static final long serialVersionUID = 8177795429146910716L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String user = req.getParameter("user"); //Name attribute in html is placed in the parameter section
		String pass = req.getParameter("pass");
		List<Reimbursment> receipt = null;
		
		ExpenseDAO dao = new ExpenseDAO();
		if(user == ""|| pass == "")
		{
			resp.sendRedirect("login.jsp");
		}else
			try {
				Users user2 = dao.userValidation(user, pass);
				req.getSession().setAttribute("login", user2);
				dao.userValidation(user, pass);
				receipt = dao.getReceipts();
				req.setAttribute("ReimbursmentList", receipt);
				req.getRequestDispatcher("ReimbursmentList.jsp").forward(req,resp);
			} catch (SQLException e) {
				e.printStackTrace();
				resp.sendRedirect("login.jsp");
			}
		}
	}