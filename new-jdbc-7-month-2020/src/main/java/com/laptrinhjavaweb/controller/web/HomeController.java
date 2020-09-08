package com.laptrinhjavaweb.controller.web;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.laptrinhjavaweb.service.ICategoryService;
import com.laptrinhjavaweb.service.INewService;

@WebServlet(urlPatterns = { "/trang-chu" }) // tao ra 1 cai mang
public class HomeController extends HttpServlet {

	@Inject
	private ICategoryService categoryService;
	@Inject
	private INewService newService;

	private static final long serialVersionUID = 2686801510274002166L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Long categoryId=1L;
		
		request.setAttribute("categories", categoryService.findAll());
		request.setAttribute("news",newService.finByCategoryId(categoryId));
		RequestDispatcher rd = request.getRequestDispatcher("/views/web/home.jsp");// truyen vo cai view muon tra ve
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}
}
