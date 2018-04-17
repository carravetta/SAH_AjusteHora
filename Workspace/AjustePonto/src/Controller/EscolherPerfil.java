package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.dao.AjustesDao;
import br.com.dao.UsuarioDao;

/*
 * Fernando Buonocore
 */

@WebServlet(urlPatterns = "/escolherPerfil")
public class EscolherPerfil extends HttpServlet{

	AjustesDao ajustes = new AjustesDao();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String perfil = req.getParameter("ferfil");
		
		if(perfil.equals("TRABALHADOR")){
			String nomeTrabalhador  = "";
			for(Cookie cookie : req.getCookies()){
				if(cookie.getName().equals("usuarioLogado") && cookie.getValue() != null){
					nomeTrabalhador = cookie.getValue();
				}
			}
			req.setAttribute("aprovar", false);
			req.setAttribute("ajustes",new AjustesDao()
	                .buscaAjusteUsuario(nomeTrabalhador));
			RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/paginas/dashBoard.jsp");
			dispatcher.forward(req, resp);
		}else{
			req.setAttribute("aprovar", true);
			req.setAttribute("ajustes",new AjustesDao()
	                .buscaAjustes());
			RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/paginas/dashBoard.jsp");
			dispatcher.forward(req, resp);
			
		}
		
	}
	
	public AjustesDao getAjustes() {
		return ajustes;
	}

	public void setAjustes(AjustesDao ajustes) {
		this.ajustes = ajustes;
	}
}
