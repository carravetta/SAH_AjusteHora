package br.com.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.EntitysEnum.StatusEnum;
import br.com.entities.Ajuste;

public class AjustesDao {

	private List<Ajuste> ajustes = new ArrayList<Ajuste>();
	
	public AjustesDao(){
		
		UsuarioDao usuariosDao = new UsuarioDao();
		
		Ajuste ajuste1 = new Ajuste(1,usuariosDao.getUsuarios().get(4), new Date(),new Date(),new Date(), "não marcou a saida",StatusEnum.Novo);
		Ajuste ajuste2 = new Ajuste(2,usuariosDao.getUsuarios().get(4), new Date(),new Date(),new Date(), "não marcou a saida",StatusEnum.AguardandoAprovacaoN1);
		Ajuste ajuste3 = new Ajuste(3,usuariosDao.getUsuarios().get(5), new Date(),new Date(),new Date(), "não marcou a saida",StatusEnum.AguardandoAprovacaoN2);
		Ajuste ajuste4 = new Ajuste(4,usuariosDao.getUsuarios().get(5), new Date(),new Date(),new Date(), "não marcou a saida",StatusEnum.Rejeitado);
		Ajuste ajuste5 = new Ajuste(5,usuariosDao.getUsuarios().get(5), new Date(),new Date(),new Date(), "não marcou a saida",StatusEnum.Aprovado);
		
		ajustes.add(ajuste1);
		ajustes.add(ajuste2);
		ajustes.add(ajuste3);
		ajustes.add(ajuste4);
		ajustes.add(ajuste5);
		
	}
	
}
