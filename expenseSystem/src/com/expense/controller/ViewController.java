package com.expense.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.expense.beans.Reimbursment;
import com.expense.dao.ExpenseDAO;

public class ViewController extends HttpServlet{

	private static final long serialVersionUID = 22249394776650956L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// tells DAO to fetch all receipts from database
		ExpenseDAO dao = new ExpenseDAO();
		List<Reimbursment> receipt = null;
		try {
			receipt = dao.getReceipts();
			req.setAttribute("ReimbursmentList", receipt);
			req.getRequestDispatcher("ReimbursmentList.jsp").forward(req,resp);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
