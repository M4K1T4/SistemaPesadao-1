/**
 * 
 */
package br.com.pesadao.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Lucas
 *
 */
@Entity
public class ContaPagar implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8121498291146302331L;
	private Integer id;
	private PedidoCompra pedidoContaPagar;
	private double valorContaPagar;
	private String descricaoContaPagar;
	private Date dataCadastroContaPagar = new Date();

	/**
	 * 
	 */
	public ContaPagar() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param pedidoContaPagar
	 * @param valorContaPagar
	 * @param descricaoContaPagar
	 * @param dataCadastroContaPagar
	 */
	public ContaPagar(Integer id, PedidoCompra pedidoContaPagar, double valorContaPagar, String descricaoContaPagar,
			Date dataCadastroContaPagar) {
		super();
		this.id = id;
		this.pedidoContaPagar = pedidoContaPagar;
		this.valorContaPagar = valorContaPagar;
		this.descricaoContaPagar = descricaoContaPagar;
		this.dataCadastroContaPagar = dataCadastroContaPagar;
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
	 * @return the pedidoContaPagar
	 */
	@ManyToOne
	@JoinColumn
	public PedidoCompra getPedidoContaPagar() {
		return pedidoContaPagar;
	}

	/**
	 * @param pedidoContaPagar
	 *            the pedidoContaPagar to set
	 */
	public void setPedidoContaPagar(PedidoCompra pedidoContaPagar) {
		this.pedidoContaPagar = pedidoContaPagar;
	}

	/**
	 * @return the valorContaPagar
	 */
	@Column(columnDefinition = "DOUBLE DEFAULT 0")
	public double getValorContaPagar() {
		return valorContaPagar;
	}

	/**
	 * @param valorContaPagar
	 *            the valorContaPagar to set
	 */
	public void setValorContaPagar(double valorContaPagar) {
		this.valorContaPagar = valorContaPagar;
	}

	/**
	 * @return the descricaoContaPagar
	 */
	@Column(columnDefinition = "VARCHAR(255) NULL DEFAULT 'Referente a produto já cadastrado'")
	public String getDescricaoContaPagar() {
		return descricaoContaPagar;
	}

	/**
	 * @param descricaoContaPagar
	 *            the descricaoContaPagar to set
	 */
	public void setDescricaoContaPagar(String descricaoContaPagar) {
		this.descricaoContaPagar = descricaoContaPagar;
	}

	/**
	 * @return the dataCadastroContaPagar
	 */
	@Temporal(TemporalType.DATE)
	public Date getDataCadastroContaPagar() {
		return dataCadastroContaPagar;
	}

	/**
	 * @param dataCadastroContaPagar
	 *            the dataCadastroContaPagar to set
	 */
	public void setDataCadastroContaPagar(Date dataCadastroContaPagar) {
		this.dataCadastroContaPagar = dataCadastroContaPagar;
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
		ContaPagar other = (ContaPagar) obj;
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
		return "ContaPagar [id=" + id + ", pedidoContaPagar=" + pedidoContaPagar + ", valorContaPagar="
				+ valorContaPagar + ", descricaoContaPagar=" + descricaoContaPagar + ", dataCadastroContaPagar="
				+ dataCadastroContaPagar + "]";
	}

}
