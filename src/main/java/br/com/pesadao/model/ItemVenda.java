/**
 * 
 */
package br.com.pesadao.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Aluno
 *
 */
@Entity
public class ItemVenda implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5581416335300612662L;
	private Integer id;
	private Produto produtoItemVenda;
	private PedidoVenda pedidoItemVenda;
	private Integer quantidadeItemVenda;
	private double valorItemVenda;
	private Date dataCadastroItemVenda = new Date();

	/**
	 * 
	 */
	public ItemVenda() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param produtoItemVenda
	 * @param pedidoItemVenda
	 * @param quantidadeItemVenda
	 * @param valorItemVenda
	 * @param dataCadastroItemVenda
	 */
	public ItemVenda(Integer id, Produto produtoItemVenda, PedidoVenda pedidoItemVenda, Integer quantidadeItemVenda,
			double valorItemVenda, Date dataCadastroItemVenda) {
		super();
		this.id = id;
		this.produtoItemVenda = produtoItemVenda;
		this.pedidoItemVenda = pedidoItemVenda;
		this.quantidadeItemVenda = quantidadeItemVenda;
		this.valorItemVenda = valorItemVenda;
		this.dataCadastroItemVenda = dataCadastroItemVenda;
	}

	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the produtoItemCompra
	 */
	@ManyToOne
	@JoinColumn
	public Produto getProdutoItemVenda() {
		return produtoItemVenda;
	}

	/**
	 * @param produtoItemCompra
	 *            the produtoItemCompra to set
	 */
	public void setProdutoItemVenda(Produto produtoItemVenda) {
		this.produtoItemVenda = produtoItemVenda;
	}

	/**
	 * @return the pedidoItemCompra
	 */
	@ManyToOne
	@JoinColumn
	public PedidoVenda getPedidoItemVenda() {
		return pedidoItemVenda;
	}

	/**
	 * @param pedidoItemCompra
	 *            the pedidoItemCompra to set
	 */
	public void setPedidoItemVenda(PedidoVenda pedidoItemVenda) {
		this.pedidoItemVenda = pedidoItemVenda;
	}

	/**
	 * @return the quantidadeItemCompra
	 */
	public Integer getQuantidadeItemVenda() {
		return quantidadeItemVenda;
	}

	/**
	 * @param quantidadeItemCompra
	 *            the quantidadeItemCompra to set
	 */
	public void setQuantidadeItemVenda(Integer quantidadeItemVenda) {
		this.quantidadeItemVenda = quantidadeItemVenda;
	}

	/**
	 * @return the valorItemCompra
	 */
	public double getValorItemVenda() {
		return valorItemVenda;
	}

	/**
	 * @param valorItemCompra
	 *            the valorItemCompra to set
	 */
	public void setValorItemVenda(double valorItemVenda) {
		this.valorItemVenda = valorItemVenda;
	}

	/**
	 * @return the dataCadastroItemCompra
	 */
	@Temporal(TemporalType.DATE)
	public Date getDataCadastroItemVenda() {
		return dataCadastroItemVenda;
	}

	/**
	 * @param dataCadastroItemCompra
	 *            the dataCadastroItemCompra to set
	 */
	public void setDataCadastroItemVenda(Date dataCadastroItemVenda) {
		this.dataCadastroItemVenda = dataCadastroItemVenda;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemVenda other = (ItemVenda) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ItemVenda [id=" + id + ", produtoItemVenda=" + produtoItemVenda + ", pedidoItemVenda=" + pedidoItemVenda
				+ ", quantidadeItemVenda=" + quantidadeItemVenda + ", valorItemVenda=" + valorItemVenda
				+ ", dataCadastroItemVenda=" + dataCadastroItemVenda + "]";
	}

	
}
