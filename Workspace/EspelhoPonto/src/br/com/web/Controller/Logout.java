package br.com.web.Controller;

import java.io.IOException;

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
	
		for(Cookie cookie : cookies){
			if(cookie.getName().equals("usuario.logado")){
				cookie.setMaxAge(0);
				resp.addCookie(cookie);
			}
		}
	}
	
}
