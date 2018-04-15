package br.com.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.EntitysEnum.StatusEnum;
import br.com.entities.Ajuste;
import br.com.entities.Usuario;

public class AjustesDao {

	private  final static Map<Integer, Ajuste> AJUSTES = new HashMap<>();
	
	static UsuarioDao users = new UsuarioDao();
	
	static {
		geraIdEAdiciona(new Ajuste((Usuario)users.buscaUsuarios().toArray()[4], new Date(),new Date(),new Date(), "não marcou a saida",StatusEnum.Novo));
		geraIdEAdiciona(new Ajuste((Usuario)users.buscaUsuarios().toArray()[4], new Date(),new Date(),new Date(), "ajudando outra área",StatusEnum.AguardandoAprovacaoN1));
		geraIdEAdiciona(new Ajuste((Usuario)users.buscaUsuarios().toArray()[5], new Date(),new Date(),new Date(), "serão",StatusEnum.AguardandoAprovacaoN2));
		geraIdEAdiciona(new Ajuste((Usuario)users.buscaUsuarios().toArray()[5], new Date(),new Date(),new Date(), "marcou sem querer",StatusEnum.Rejeitado));
		geraIdEAdiciona(new Ajuste((Usuario)users.buscaUsuarios().toArray()[5], new Date(),new Date(),new Date(), "entrega de relatório urgente",StatusEnum.Aprovado));
	}
	
	public void adiciona(Ajuste ajuste) {
		geraIdEAdiciona(ajuste);
	}
	
	private static void geraIdEAdiciona(Ajuste ajuste) {
		int id = AJUSTES.size()+1;
		ajuste.setId(id);
		AJUSTES.put(id, ajuste);
	}
	
	public Collection<Ajuste> buscaAjustes() {
		return AJUSTES.values();
	}
	
	public Collection<Ajuste> buscaAjusteUsuario(String nomeUsuario) {
		if (nomeUsuario == null){
			return buscaAjustes();
		}
		List<Ajuste> ajustes = new ArrayList<>();;
		for (Ajuste ajuste : AJUSTES.values()) {
			if (ajuste.getUsuario() != null && ajuste.getUsuario().getNome().toLowerCase().contains(nomeUsuario.toLowerCase())){
				ajustes.add(ajuste);
			}
		}
		return ajustes;
	}
}
