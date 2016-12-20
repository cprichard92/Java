/**
 * @author yru289
 *
 */
package com.expense.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="*.do")
public class ExpenseServletDispatcher extends HttpServlet{

	private static final long serialVersionUID = -1869420961975749345L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String requestURI = req.getRequestURI();
			System.out.println(requestURI);
		switch ( requestURI )
		{
			case "/expenseSystem/login.do":
				new LoginController().doPost(req, resp);
				break;
			case "/expenseSystem/ReimbursmentList.do":
				new ViewController().doGet(req, resp);
				break;
			case "/expenseSystem/AddReceipt.do":
				new AddController().doGet(req,resp);
				break;
			case "/expenseSystem/decision.do":
				new ApproveController().doGet(req, resp);
				break;
//			case "/expenseSystem/Decline.do":
//				break;
			default:
				throw new IllegalArgumentException("Invalid URI");
		}
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}