package com.mforyt.servletjsp.web.servlet.example;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/first")
public class FirstServlet extends HttpServlet {
	
	
	
	// FirstServlet
	// LoginServlet
	// SecondServlet
	// ThirdServlet
	@Override
	//implementujemy metode GET
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		List<String> list = Arrays.asList("Michal", "Marcin", "Lara",
				"Anna");
		request.setAttribute("bestBatsmanList", list);

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Michal", 151);
		map.put("Marcin", 229);
		map.put("Lara", 344);
		map.put("Anna", 416);

		request.setAttribute("bestBatsmanCenturiesMap", map);

		request.setAttribute("batsmanName", "Sachin");

		//request.getRequestDispatcher("/WEB-INF/views/first.jsp").forward(
		//		request, response);
	   response.sendRedirect("second.jsp");		//request.getParameter("secondPage");
		//request.getRequestDispatcher("/second.jsp");


	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
