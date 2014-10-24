package br.com.up.enquete.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import br.com.up.enquete.dao.AulaDao;
import br.com.up.enquete.entity.Aula;

@ManagedBean(name = "MBeanAula")
public class MBeanAula {

	private Long id;
	private Long numAula;
	private Date data;
	private String descricao;

	private List<Aula> aulas;

	@PostConstruct
	public void carregarAulas() {
		aulas = new AulaDao().listar();

	}

	public void salvar() {

		Aula a = new Aula();
		a.setId(id);
		a.setNumAula(numAula);
		a.setData(data);
		a.setDescricao(descricao);

		// insere a aula no banco de dados
		if (a.getId() == null) {
			new AulaDao().inserir(a);
		} else {
			new AulaDao().alterar(a);
		}

		// realiza a busca por aulas novamente
		aulas = new AulaDao().listar();

		// limpa os campos do formulário
		id = null;
		numAula = null;
		data = null;
		descricao = null;
	}

	public void carregarAula(Long idAula) {

		Aula aula = new AulaDao().buscarPorId(idAula);

		id = aula.getId();
		numAula = aula.getNumAula();
		data = aula.getData();
		descricao = aula.getDescricao();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getNumAula() {
		return numAula;
	}

	public void setNumAula(Long numAula) {
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

	public List<Aula> getAulas() {
		return aulas;
	}

	public void setAulas(List<Aula> aulas) {
		this.aulas = aulas;
	}

}
