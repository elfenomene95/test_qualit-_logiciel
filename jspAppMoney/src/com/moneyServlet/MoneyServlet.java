package com.moneyServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.moneyBag.Money;
import com.moneyBag.MoneyBag;

/**
 * Servlet implementation class MoneyServlet
 */
@WebServlet("/MoneyServlet")
public class MoneyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MoneyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int amount = Integer.parseInt(request.getParameter("amount"));
		int amount1 = Integer.parseInt(request.getParameter("amount1"));
		
		String currency = request.getParameter("devise");
		String currency1 = request.getParameter("devise");
		
		MoneyBag mB = new MoneyBag();
		Money money = mB.normalisation(new Money(amount, currency));
		Money money1 = mB.normalisation(new Money(amount1, currency1));
		
		money.add(money1);
		System.out.println(money.amount());
		
		request.setAttribute("res", money.amount());
		this.getServletContext().getRequestDispatcher("/MoneyWebJSP.jsp").forward(request, response);
	}

}
