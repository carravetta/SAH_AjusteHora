package br.com.web.filtro;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@WebFilter(urlPatterns="/*")
public class FiltroAuditoria implements Filter{

	private static String deslogado = "deslogado";
	
	private String usuario;
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		String uri = req.getRequestURI();
		
		String usuario = getUsuarioLogado(req);
		
		System.out.println("Pagina acessando: " + uri);
		
		//if(!usuario.equals(deslogado)){
			chain.doFilter(request, response);
		//}
	}
	
	private String getUsuarioLogado(HttpServletRequest req){
		
		Cookie[] cookies = req.getCookies();
		usuario = deslogado;
		if(cookies == null){
			return usuario;
		}
		for(Cookie cookie : cookies){
			if(cookie.getName().equals("usuario.logado")){
				usuario = cookie.getValue();
			}
		}
		
		return usuario;
	}

	@Override
	public void destroy() {
	}

}
