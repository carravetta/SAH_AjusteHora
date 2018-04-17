package Controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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

/*
 * Fernando Buonocore
 */

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
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		
		DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");

		Date dataGeral = new Date();
		Date dataInicial = new Date();
		Date dataFinal = new Date();
		try{
			String data = req.getParameter("data");
			dataGeral = df.parse(data);
			String horaInicial = req.getParameter("horaInicial");
			dataInicial = df2.parse(horaInicial);
			String horaFinal = req.getParameter("horaFinal");
			dataFinal = df2.parse(horaFinal);
		}catch(Exception e){
			e.printStackTrace();
		}
		String justificativa = req.getParameter("justificativa");

		if((dataGeral.equals(dataInicial) || dataGeral.before(dataInicial) ) && dataInicial.before(dataFinal)){
			Ajuste ajuste = new Ajuste(userNovoAjuste,dataGeral, dataInicial, dataFinal, justificativa, StatusEnum.AguardandoAprovacaoN1);
			ajusDao.adiciona(ajuste);
		}
		req.setAttribute("ajustes", ajustesList);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/paginas/dashBoard.jsp");
		dispatcher.forward(req, resp);
	}

}
