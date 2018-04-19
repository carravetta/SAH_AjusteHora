package br.com.entities;

import java.util.Date;

import br.com.EntitysEnum.StatusEnum;

public class Ajuste {

	private Integer id;
	private Usuario usuario;
	private Date data;
	private Date horaInicial;
	private Date horaFinal;
	private String justificativa;
	private StatusEnum status;
	
	public Ajuste(Usuario usuario, Date data, Date horaInicial, Date horaFinal, String justificativa,
			StatusEnum status) {
		super();
		this.usuario = usuario;
		this.data = data;
		this.horaInicial = horaInicial;
		this.horaFinal = horaFinal;
		this.justificativa = justificativa;
		this.status = status;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Date getHoraInicial() {
		return horaInicial;
	}
	public void setHoraInicial(Date horaInicial) {
		this.horaInicial = horaInicial;
	}
	public Date getHoraFinal() {
		return horaFinal;
	}
	public void setHoraFinal(Date horaFinal) {
		this.horaFinal = horaFinal;
	}
	public String getJustificativa() {
		return justificativa;
	}
	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}
	public StatusEnum getStatus() {
		return status;
	}
	public void setStatus(StatusEnum status) {
		this.status = status;
	}
	
}
