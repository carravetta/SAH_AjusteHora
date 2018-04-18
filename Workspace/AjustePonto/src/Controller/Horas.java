package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/horas")
public class Horas extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)   throws ServletException, IOException{
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/paginas/horas.jsp");
		dispatcher.forward(req, resp);
	}
}

