/**
 * 
 */
package br.com.pesadao.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.pesadao.model.ItemVenda;


/**
 * @author Lucas
 *
 */
public class ItemVendaDao {

	public void salvar(ItemVenda itemVenda) {
		EntityManager entityManager = JPAUtil.getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.merge(itemVenda);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	@SuppressWarnings("unchecked")
	public List<ItemVenda> listarItensVenda(Integer pedido) {
		EntityManager entityManager = JPAUtil.getEntityManager();
		Query query = entityManager.createQuery("from ItemVenda where pedidoItemVenda_id="+pedido);
		return query.getResultList();
	}
	
	public void excluir(ItemVenda itemVenda) {
		EntityManager entityManager = JPAUtil.getEntityManager();
		entityManager.getTransaction().begin();
		itemVenda = entityManager.merge(itemVenda);
		entityManager.remove(itemVenda);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}
