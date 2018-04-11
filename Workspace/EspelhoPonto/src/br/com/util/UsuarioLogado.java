package br.com.util;

import javax.servlet.http.Cookie;

public class UsuarioLogado {

	private static Cookie cookie = null;

	public Cookie getCookie() {
		return cookie;
	}

	public void setCookie(Cookie cookie) {
		this.cookie = cookie;
	}
	
}
