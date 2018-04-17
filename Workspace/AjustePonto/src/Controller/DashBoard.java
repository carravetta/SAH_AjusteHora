package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Fernando Buonocore
 */

@WebServlet(urlPatterns = "/dashBoard")
public class DashBoard extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/paginas/adicionaAjuste.jsp");
		dispatcher.forward(req, resp);
	}
}
