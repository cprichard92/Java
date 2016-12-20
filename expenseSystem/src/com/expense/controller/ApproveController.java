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

public class ApproveController extends HttpServlet{

	private static final long serialVersionUID = 1851698477242577354L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String status = req.getParameter("decision"); //Always set default by form
		System.out.println(status);
		String submissionId = req.getParameter("submissionId");
		System.out.println(submissionId);
		//int num = ParseInt(submissionId);
		
		
		System.out.println(submissionId);
		// Get the Approve or Decline decision from form
		ExpenseDAO dao = new ExpenseDAO();
		try {
			List<Reimbursment> decision = dao.updateStatus(status, (Users) req.getSession().getAttribute("login"));
			
			//Send to the view
			//req.setAttribute("submissionId", num);
			req.setAttribute("ReimbursmentList", decision);
			req.getRequestDispatcher("ReimbursmentList.jsp").forward(req,resp);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private int ParseInt(String submissionId) {
		// TODO Auto-generated method stub
		return 0;
	}
}
