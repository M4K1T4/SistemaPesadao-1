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
public class ContaReceber implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4337992567305518286L;
	private Integer id;
	private PedidoVenda pedidoContaReceber;
	private double valorContaReceber;
	private String descricaoContaReceber;
	private Date dataCadastroContaReceber = new Date();

	/**
	 * 
	 */
	public ContaReceber() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param pedidoContaReceber
	 * @param valorContaReceber
	 * @param descricaoContaReceber
	 * @param dataCadastroContaReceber
	 */
	public ContaReceber(Integer id, PedidoVenda pedidoContaReceber, double valorContaReceber,
			String descricaoContaReceber, Date dataCadastroContaReceber) {
		super();
		this.id = id;
		this.pedidoContaReceber = pedidoContaReceber;
		this.valorContaReceber = valorContaReceber;
		this.descricaoContaReceber = descricaoContaReceber;
		this.dataCadastroContaReceber = dataCadastroContaReceber;
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
	 * @return the pedidoContaReceber
	 */
	@ManyToOne
	@JoinColumn
	public PedidoVenda getPedidoContaReceber() {
		return pedidoContaReceber;
	}

	/**
	 * @param pedidoContaReceber
	 *            the pedidoContaReceber to set
	 */
	public void setPedidoContaReceber(PedidoVenda pedidoContaReceber) {
		this.pedidoContaReceber = pedidoContaReceber;
	}

	/**
	 * @return the valorContaReceber
	 */
	@Column(columnDefinition = "DOUBLE DEFAULT 0")
	public double getValorContaReceber() {
		return valorContaReceber;
	}

	/**
	 * @param valorContaReceber
	 *            the valorContaReceber to set
	 */
	public void setValorContaReceber(double valorContaReceber) {
		this.valorContaReceber = valorContaReceber;
	}

	/**
	 * @return the descricaoContaReceber
	 */
	@Column(columnDefinition = "VARCHAR(255) NULL DEFAULT 'Referente a produto já cadastrado'")
	public String getDescricaoContaReceber() {
		return descricaoContaReceber;
	}

	/**
	 * @param descricaoContaReceber
	 *            the descricaoContaReceber to set
	 */
	public void setDescricaoContaReceber(String descricaoContaReceber) {
		this.descricaoContaReceber = descricaoContaReceber;
	}

	/**
	 * @return the dataCadastroContaReceber
	 */
	@Temporal(TemporalType.DATE)
	public Date getDataCadastroContaReceber() {
		return dataCadastroContaReceber;
	}

	/**
	 * @param dataCadastroContaReceber
	 *            the dataCadastroContaReceber to set
	 */
	public void setDataCadastroContaReceber(Date dataCadastroContaReceber) {
		this.dataCadastroContaReceber = dataCadastroContaReceber;
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
		ContaReceber other = (ContaReceber) obj;
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
		return "ContaReceber [id=" + id + ", pedidoContaReceber=" + pedidoContaReceber + ", valorContaReceber="
				+ valorContaReceber + ", descricaoContaReceber=" + descricaoContaReceber + ", dataCadastroContaReceber="
				+ dataCadastroContaReceber + "]";
	}
}
