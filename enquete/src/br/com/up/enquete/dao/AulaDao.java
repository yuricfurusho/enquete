package br.com.up.enquete.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.up.enquete.entity.Aula;

public class AulaDao {

	public void inserir(Aula aula) {

		EntityManager em = Conexao.getEntityManager();

		em.getTransaction().begin();

		em.persist(aula);

		em.getTransaction().commit();

	}

	public List<Aula> listar() {

		EntityManager em = Conexao.getEntityManager();

		Query query = em.createQuery("from Aula");

		return query.getResultList();
	}

	public Aula buscarPorId(Long id) {
		EntityManager em = Conexao.getEntityManager();

		return em.find(Aula.class, id);

	}

	public void alterar(Aula aula) {

		EntityManager em = Conexao.getEntityManager();

		em.getTransaction().begin();

		em.merge(aula);

		em.getTransaction().commit();

	}

	public void excluir(Aula aula) {

	}

}
