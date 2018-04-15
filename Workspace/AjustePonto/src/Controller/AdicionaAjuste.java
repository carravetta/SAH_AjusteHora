package Controller;

import java.io.IOException;
import java.util.Collection;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.EntitysEnum.StatusEnum;
import br.com.dao.AjustesDao;
import br.com.dao.UsuarioDao;
import br.com.entities.Ajuste;
import br.com.entities.Usuario;

@WebServlet(urlPatterns = "/adicionaAjuste")
public class AdicionaAjuste extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		AjustesDao ajusDao = new AjustesDao();
		UsuarioDao user = new UsuarioDao();
		
		Collection<Ajuste> ajustesList = ajusDao
                .buscaAjustes();

		Usuario userNovoAjuste = null;
		
		String trabalhador = req.getParameter("trabalhador");
		if(trabalhador != null){
			userNovoAjuste = user.buscaUsuario(trabalhador);
		}
		String data = req.getParameter("data");
		
		String horaInicial = req.getParameter("horaInicial");
		String horaFinal = req.getParameter("horaFinal");
		String justificativa = req.getParameter("justificativa");

		Ajuste ajuste = new Ajuste(userNovoAjuste,new Date(), new Date(), new Date(), justificativa, StatusEnum.AguardandoAprovacaoN1);
	        
		ajusDao.adiciona(ajuste);

		req.setAttribute("ajustes", ajustesList);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/paginas/dashBoard.jsp");
		dispatcher.forward(req, resp);
	}

}
