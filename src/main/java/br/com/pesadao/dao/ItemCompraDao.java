/**
 * 
 */
package br.com.pesadao.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.pesadao.model.ItemCompra;
import br.com.pesadao.model.ItemVenda;


/**
 * @author Lucas
 *
 */
public class ItemCompraDao {

	public void salvar(ItemCompra itemcompra) {
		EntityManager entityManager = JPAUtil.getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.merge(itemcompra);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	@SuppressWarnings("unchecked")
	public List<ItemCompra> listarItensCompra() {
		EntityManager entityManager = JPAUtil.getEntityManager();
		Query query = entityManager.createQuery("from ItemCompra Order By id");
		return query.getResultList();
	}
	
	public void excluir(ItemCompra itemcompra) {
		EntityManager entityManager = JPAUtil.getEntityManager();
		entityManager.getTransaction().begin();
		itemcompra = entityManager.merge(itemcompra);
		entityManager.remove(itemcompra);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}
