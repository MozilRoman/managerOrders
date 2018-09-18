package com.softserve.edu.items.controllers.users;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.softserve.edu.items.controllers.ViewUrls;

@WebServlet("/recoverpassword")
public class UserRecoverPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UserRecoverPassword() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		getServletConfig().getServletContext().getRequestDispatcher(ViewUrls.RECOVER_PASSWORD_JSP.toString())
				.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
