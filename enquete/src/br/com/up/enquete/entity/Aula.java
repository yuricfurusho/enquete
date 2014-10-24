package br.com.up.enquete.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="AULA")
public class Aula {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private Long numAula;
	
	@Temporal(TemporalType.DATE)
	private Date data;
	
	private String descricao;
	public Long getId() {
		return id;
	
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public long getNumAula() {
		return numAula;
	}
	
	public void setNumAula(long numAula) {
		this.numAula = numAula;
	}
	
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}
