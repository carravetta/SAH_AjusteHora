package br.com.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.entities.Usuario;

public class UsuarioDao {

	private List<Usuario> usuarios = new ArrayList<Usuario>();

	public UsuarioDao(){
		Usuario fernando = new Usuario("fernando", "fer@uni.com", "123");
		Usuario caio = new Usuario("caio", "caio@uni.com", "123");
		Usuario ananda = new Usuario("ananda", "ananda@uni.com", "123");
		Usuario carraveta = new Usuario("carraveta", "carraveta@uni.com", "123");
		
		usuarios.add(fernando);
		usuarios.add(caio);
		usuarios.add(ananda);
		usuarios.add(carraveta);
	}
	
	public List<Usuario> usuariosPermissao(){
		return usuarios;
	}
	
}
