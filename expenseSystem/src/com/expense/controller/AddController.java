package com.expense.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.expense.beans.Reimbursment;
import com.expense.dao.ExpenseDAO;

public class AddController extends HttpServlet{

	private static final long serialVersionUID = 5773767872496262250L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// Parsing Numeric Values
		int submissionId = Integer.parseInt(req.getParameter("submissionId"));
		double amount = Double.parseDouble( req.getParameter("amount") );
		String description = req.getParameter("description");
		int submitterId = Integer.parseInt( req.getParameter("submitterId") );
		String type = req.getParameter("type");
		
		// Create new Receipts with the values pulled from the form
		Reimbursment rec = new Reimbursment(
				submissionId,
				amount,
				description,
				submitterId,
				type);
		
		// Tells DAO to perform the function for add receipt
		ExpenseDAO dao = new ExpenseDAO();
		List<Reimbursment> receipt = null;
		try {
			// Add Receipt to table
			dao.addReceipt(rec);
			
			//Send to the view
			receipt = dao.getReceipts();
			req.setAttribute("ReimbursmentList", receipt);
			req.getRequestDispatcher("ReimbursmentList.jsp").forward(req,resp);
		} catch (Exception e) {
			e.printStackTrace();
			resp.sendRedirect("ReimbursmentList.jsp");
		}
	}
}
