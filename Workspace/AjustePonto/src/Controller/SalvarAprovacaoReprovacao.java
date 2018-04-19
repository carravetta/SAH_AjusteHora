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

@WebServlet(urlPatterns = "/salvarAprovacaoReprovacao")
public class SalvarAprovacaoReprovacao extends HttpServlet{

	AjustesDao ajustes = new AjustesDao();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String aprovou = req.getParameter("aprovou");
		String reprovou = req.getParameter("reprovou");
		
		String ajusteCookie  = "";
		for(Cookie cookie : req.getCookies()){
			if(cookie.getName().equals("ajusteCookie") && cookie.getValue() != null){
				ajusteCookie = cookie.getValue();
			}
		}
		
		Ajuste ajusteAprovarReprovar = ajustes.buscaAjusteId(Integer.parseInt(ajusteCookie));
		
		if(aprovou != null && aprovou.equals("on")){
			ajustes.aprovaReprova(true, ajusteAprovarReprovar);
		}else if(reprovou != null && reprovou.equals("on")){
			ajustes.aprovaReprova(false, ajusteAprovarReprovar);
		}
		
		req.setAttribute("ajustes",ajustes
                .buscaAjustes());
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/paginas/dashBoard.jsp");
		dispatcher.forward(req, resp);
	}
}
