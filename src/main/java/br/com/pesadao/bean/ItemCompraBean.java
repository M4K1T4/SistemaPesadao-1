/**
 * 
 */
package br.com.pesadao.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.pesadao.dao.ItemCompraDao;
import br.com.pesadao.dao.ProdutoDao;
import br.com.pesadao.model.ItemCompra;
import br.com.pesadao.model.Produto;

/**
 * @author Lucas
 *
 */
@ManagedBean
@SessionScoped
public class ItemCompraBean {
	private ItemCompra itemCompra = new ItemCompra();
	private List<ItemCompra> itensCompra = new ArrayList<ItemCompra>();
	private List<Produto> produtos;

	private PedidoVendaBean pedidoCompraBean;

	public ItemCompraBean() {
		produtos = new ProdutoDao().listarProdutos();
	}

	public String salvar() {
		new ItemCompraDao().salvar(itemCompra);
		itensCompra = new ItemCompraDao().listarItensCompra();
		itemCompra = new ItemCompra();
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Item salvo com sucesso!"));
		return "pedido_template";
	}

	public void excluir() {
		new ItemCompraDao().excluir(itemCompra);
		new ItemCompraDao().salvar(itemCompra);
		produtos = new ProdutoDao().listarProdutos();
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Item exclu�do com sucesso!"));
		itensCompra = new ItemCompraDao().listarItensCompra();
	}

	public void prepararModel(ItemCompra itemCompra) {
		this.itemCompra = itemCompra;
	}

	/**
	 * @return the itemCompra
	 */
	public ItemCompra getItemCompra() {
		return itemCompra;
	}

	/**
	 * @param itemCompra
	 *            the itemCompra to set
	 */
	public void setItemCompra(ItemCompra itemCompra) {
		this.itemCompra = itemCompra;
	}

	/**
	 * @return the itensCompra
	 */
	public List<ItemCompra> getItensCompra() {
		return itensCompra;
	}

	/**
	 * @param itensCompra
	 *            the itensCompra to set
	 */
	public void setItensCompra(List<ItemCompra> itensCompra) {
		this.itensCompra = itensCompra;
	}

	/**
	 * @return the produtos
	 */
	public List<Produto> getProdutos() {
		return produtos;
	}

	/**
	 * @param produtos
	 *            the produtos to set
	 */
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	/**
	 * @return the pedidoCompraBean
	 */
	public PedidoVendaBean getPedidoCompraBean() {
		return pedidoCompraBean;
	}

	/**
	 * @param pedidoCompraBean
	 *            the pedidoCompraBean to set
	 */
	public void setPedidoCompraBean(PedidoVendaBean pedidoCompraBean) {
		this.pedidoCompraBean = pedidoCompraBean;
	}
}
