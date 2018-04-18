package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.servlet4preview.RequestDispatcher;

@WebServlet(urlPatterns = "/horas")
public class Horas extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		//session.putValue("usuarioLogado", "Usuario e senha incorretos!");
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/paginas/adicionaAjuste.jsp");
		dispatcher.forward(req, resp);
	}
}

