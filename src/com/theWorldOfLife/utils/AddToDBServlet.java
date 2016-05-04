package com.theWorldOfLife.utils;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TheWorldOfLifeServlet")
public class AddToDBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Species dbEntry = new Species();

	public AddToDBServlet() {
		
		
		

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		dbEntry.setSpeciesName(request.getParameter("form-speciesName"));
		dbEntry.setAniGen(request.getParameter("form-genus"));
		dbEntry.setAniFam(request.getParameter("form-family"));
		dbEntry.setAniOrd(request.getParameter("form-order"));
		dbEntry.setAniClas(request.getParameter("form-class"));
		dbEntry.setAniPhy(request.getParameter("form-phylum"));
		dbEntry.setAniKin(request.getParameter("form-kingdom"));
		dbEntry.setAniCom(request.getParameter("form-common"));
		dbEntry.setAveWei(request.getParameter("form-weight"));
		dbEntry.setAveLif(request.getParameter("form-lifespan"));
		dbEntry.setAniDom(request.getParameter("form-domes"));
		dbEntry.setAniHab(request.getParameter("form-habitat"));
		dbEntry.setAniFamEx(request.getParameter("form-famous"));

		System.out.println(dbEntry);

		System.out.println("stuff");

		ConnToDB.addToTheDB(dbEntry);

		if(ConnToDB.passOrFail) {
			response.sendRedirect("index.html");
		}
		
	}

}
