package br.com.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.EntitysEnum.PerfilEnum;
import br.com.entities.Usuario;

public class UsuarioDao {

	private List<Usuario> usuarios = new ArrayList<Usuario>();

	public UsuarioDao(){
		Usuario fernando = new Usuario("fernando", "fer@uni.com", "123", PerfilEnum.Administrador);
		Usuario caio = new Usuario("caio", "caio@uni.com", "123", PerfilEnum.Administrador);
		Usuario ananda = new Usuario("ananda", "ananda@uni.com", "123", PerfilEnum.Administrador);
		Usuario carraveta = new Usuario("carraveta", "carraveta@uni.com", "123", PerfilEnum.Administrador);
		Usuario trabalhador1 = new Usuario("trabalhador1", "trabalhador1@uni.com", "123", PerfilEnum.Trabalhador);
		Usuario trabalhador2 = new Usuario("trabalhador2", "trabalhador2@uni.com", "123", PerfilEnum.Trabalhador);
		
		usuarios.add(fernando);
		usuarios.add(caio);
		usuarios.add(ananda);
		usuarios.add(carraveta);
		usuarios.add(trabalhador1);
		usuarios.add(trabalhador2);
	}
	
	public List<Usuario> usuariosPermissao(){
		return usuarios;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
}
