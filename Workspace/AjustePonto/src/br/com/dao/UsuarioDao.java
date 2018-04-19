package br.com.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.com.EntitysEnum.PerfilEnum;
import br.com.entities.Usuario;

public class UsuarioDao {

	private  final static Map<Integer, Usuario> USUARIOS = new HashMap<>();
	
	static {
		geraIdEAdiciona(new Usuario("fernando", "fer@uni.com", "123", PerfilEnum.Administrador));
		geraIdEAdiciona(new Usuario("caio", "caio@uni.com", "123", PerfilEnum.Administrador));
		geraIdEAdiciona(new Usuario("ananda", "ananda@uni.com", "123", PerfilEnum.Administrador));
		geraIdEAdiciona(new Usuario("carraveta", "carraveta@uni.com", "123", PerfilEnum.Administrador));
		geraIdEAdiciona(new Usuario("trabalhador1", "trabalhador1@uni.com", "123", PerfilEnum.Trabalhador));
		geraIdEAdiciona(new Usuario("trabalhador2", "trabalhador2@uni.com", "123", PerfilEnum.Trabalhador));
	}
	
	public void adiciona(Usuario usuario) {
		geraIdEAdiciona(usuario);
	}
	
	private static void geraIdEAdiciona(Usuario user) {
		int id = USUARIOS.size()+1;
		user.setId(id);
		USUARIOS.put(id, user);
	}
	
	public Collection<Usuario> buscaUsuarios() {
		return USUARIOS.values();
	}
	
	public Usuario buscaUsuario(String nome) {
		if (nome == null){
			return null;
		}
		
		for (Usuario usuario : USUARIOS.values()) {
			if (usuario.getNome().toLowerCase().contains(nome.toLowerCase())){
				return usuario;
			}
		}
		return null;
		
	}
	
	/*public UsuarioDao(){
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
	}*/
	
}
