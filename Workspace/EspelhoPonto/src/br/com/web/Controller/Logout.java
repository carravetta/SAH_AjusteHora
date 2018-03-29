package br.com.web.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/logout")
public class Logout extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] cookies = req.getCookies();
	
		String usuario = "Nenhum";
		
		//Assim tira o cookie do navegador e desloga o usuario
		for(Cookie cookie : cookies){
			if(cookie.getName().equals("usuario.logado")){
				usuario =  cookie.getValue();
				cookie.setMaxAge(0);
				resp.addCookie(cookie);
			}
		}
		
		//para o atributo para o jsp, assim mostra na tela o que passar nesse parametro
		req.setAttribute("usuario", usuario);
		
		//Assim redireciona para outra pagina html
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/paginas/logout.jsp");
		dispatcher.forward(req, resp);
	}
	
}
