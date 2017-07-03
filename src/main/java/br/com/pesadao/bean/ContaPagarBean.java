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

import br.com.pesadao.dao.ContaPagarDao;
import br.com.pesadao.model.ContaPagar;


/**
 * @author Lucas
 *
 */
@ManagedBean
@SessionScoped
public class ContaPagarBean {

	private ContaPagar contaPagar = new ContaPagar();
	private List<ContaPagar> contasPagar = new ArrayList<ContaPagar>();

	public ContaPagarBean() {
		contasPagar = new ContaPagarDao().listarContasPagar();
	}

	public String salvar() {
		new ContaPagarDao().salvar(contaPagar);
		contasPagar = new ContaPagarDao().listarContasPagar();
		contaPagar = new ContaPagar();
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Conta a pagar cadastrada com sucesso!"));
		return "contaspagarlist?faces-redirect=true";
	}
	
	public void limpar() {
		this.contaPagar = new ContaPagar();
	}

	/**
	 * @return the contaPagar
	 */
	public ContaPagar getContaPagar() {
		return contaPagar;
	}

	/**
	 * @param contaPagar the contaPagar to set
	 */
	public void setContaPagar(ContaPagar contaPagar) {
		this.contaPagar = contaPagar;
	}

	/**
	 * @return the contasPagar
	 */
	public List<ContaPagar> getContasPagar() {
		return contasPagar;
	}

	/**
	 * @param contasPagar the contasPagar to set
	 */
	public void setContasPagar(List<ContaPagar> contasPagar) {
		this.contasPagar = contasPagar;
	}
}
