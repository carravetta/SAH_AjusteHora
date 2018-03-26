package br.com.web.Controller;

import java.io.IOException;

import javax.jws.WebMethod;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.dao.UsuarioDao;
import br.com.entities.Usuario;

@WebServlet(urlPatterns = "/login")
public class LoginController extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String email = req.getParameter("email");
		String senha = req.getParameter("senha");
		
		UsuarioDao usuarioDao = new UsuarioDao();
		
		boolean autorizado = false;
		for(Usuario user : usuarioDao.usuariosPermissao()){
			if(email != null && senha != null && user.getEmail().equals(email) && user.getSenha().equals(senha)){
				autorizado = true;
				Cookie cookie = new Cookie("usuario.logado", user.getNome());
				cookie.setMaxAge(60*5);
				resp.addCookie(cookie);
				break;
			}
		}
		
		if(autorizado){
		
		}
	}
	
}
