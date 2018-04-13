package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.EntitysEnum.PerfilEnum;
import br.com.dao.UsuarioDao;
import br.com.entities.Usuario;
import br.com.util.UsuarioLogado;

@WebServlet(urlPatterns = "/login")
public class Login extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String email = req.getParameter("email");
		String senha = req.getParameter("senha");
		
		UsuarioDao usuarioDao = new UsuarioDao();
		
		UsuarioLogado logado = new UsuarioLogado();
		
		for(Usuario user : usuarioDao.usuariosPermissao()){
			if(email != null && senha != null && user.getEmail().equals(email) && user.getSenha().equals(senha)){
				Cookie cookie = new Cookie("usuarioLogado", user.getNome());
				cookie.setMaxAge(60*5);
				logado.setCookie(cookie);
				logado.setUsuario(user);
				resp.addCookie(logado.getCookie());
				break;
			}
		}
		

		if(logado.getUsuario() != null){
			HttpSession session = req.getSession();
		    session.putValue("usuarioLogado", logado.getCookie().getValue());
			if(logado.getUsuario().getPerfil().equals(PerfilEnum.Trabalhador)){
				//Assim redireciona para outra pagina html
				RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/paginas/dashBoard.jsp");
				dispatcher.forward(req, resp);
			}else{
				RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/paginas/escolherPerfil.jsp");
				dispatcher.forward(req, resp);
			}
		}else{
			HttpSession session = req.getSession();
			session.setAttribute("usuarioLogado", "\nUsuario e senha incorretos!");
			RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
			dispatcher.forward(req, resp);
		}
	}
	
}
