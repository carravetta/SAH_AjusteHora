package br.com.util;

import javax.servlet.http.Cookie;

import br.com.entities.Usuario;

public class UsuarioLogado {

	private static Cookie cookie = null;
	private Usuario usuario;

	public Cookie getCookie() {
		return cookie;
	}

	public void setCookie(Cookie cookie) {
		this.cookie = cookie;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
