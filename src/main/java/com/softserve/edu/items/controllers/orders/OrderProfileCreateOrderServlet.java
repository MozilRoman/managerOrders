package com.softserve.edu.items.controllers.orders;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.softserve.edu.items.controllers.ControllerUrls;
import com.softserve.edu.items.controllers.ViewUrls;
import com.softserve.edu.items.controllers.commons.Security;
import com.softserve.edu.items.dto.OrderDto;

@WebServlet("/ordercreate")
public class OrderProfileCreateOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public OrderProfileCreateOrderServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (!Security.isActiveSession(request, response)) {
			getServletConfig().getServletContext().getRequestDispatcher(ControllerUrls.LOGOUT_SERVLET.toString())
					.forward(request, response);
		} else {
			OrderDto orderDto = new OrderDto(0L, "", "", "", 0, "");
			request.setAttribute("orderDto", orderDto);
			getServletConfig().getServletContext().getRequestDispatcher(ViewUrls.ORDER_PROFILE_JSP.toString())
					.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
