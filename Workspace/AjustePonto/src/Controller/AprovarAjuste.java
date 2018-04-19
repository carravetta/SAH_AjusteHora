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
import br.com.entities.Ajuste;

/*
 * Fernando Buonocore
 */

@WebServlet(urlPatterns = "/aprovarAjuste")
public class AprovarAjuste extends HttpServlet{

	AjustesDao ajustes = new AjustesDao();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String nomeTrabalhador  = "";
		/*
		for(Cookie cookie : req.getCookies()){
			if(cookie.getName().equals("usuarioLogado") && cookie.getValue() != null){
				nomeTrabalhador = cookie.getValue();
			}
		}*/
		
		String ajusteSelecionado = req.getParameter("ajusteAprovar");
		
		Ajuste ajusteAprovarReprovar = ajustes.buscaAjusteId(Integer.parseInt(ajusteSelecionado));

		if(ajusteAprovarReprovar != null && ajusteAprovarReprovar.getUsuario() != null){
			nomeTrabalhador = ajusteAprovarReprovar.getUsuario().getNome();
		}
		
		req.setAttribute("trabalhadorAprovar", nomeTrabalhador);
		Cookie cookie = new Cookie("ajusteCookie", ajusteSelecionado);
		resp.addCookie(cookie);
		
		req.setAttribute("ajusteAprovarReprovar", ajusteAprovarReprovar);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/paginas/aprovarAjuste.jsp");
		dispatcher.forward(req, resp);
	}
}
