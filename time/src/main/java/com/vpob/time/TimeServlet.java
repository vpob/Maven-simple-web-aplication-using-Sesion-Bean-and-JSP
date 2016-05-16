package com.vpob.time;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/current")
public class TimeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		TimeSessionBean obj = new TimeSessionBean();
		Date td = obj.getCurrentDate();
		SimpleDateFormat dformat = new SimpleDateFormat("hh:mm");
		String b = dformat.format(td);		
		request.setAttribute("date", b);
		RequestDispatcher requestDisp = getServletContext().getRequestDispatcher("/index.jsp");
		requestDisp.forward(request, response);

		
		
	}
}
