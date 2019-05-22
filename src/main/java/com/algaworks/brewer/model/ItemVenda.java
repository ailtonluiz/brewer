/**
 * 22 de mai de 2019
 * brewer
 * ailto
 */
package com.algaworks.brewer.model;

import java.math.BigDecimal;

/**
 * @author ailto
 *
 */
public class ItemVenda {

	private Long codigo;
	private Integer quantidade;
	private BigDecimal valorUnitario;
	private Cerveja cerveja;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(BigDecimal valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public Cerveja getCerveja() {
		return cerveja;
	}

	public void setCerveja(Cerveja cerveja) {
		this.cerveja = cerveja;
	}

	public BigDecimal getValorTotal() {
		return valorUnitario.multiply(new BigDecimal(quantidade));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cerveja == null) ? 0 : cerveja.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemVenda other = (ItemVenda) obj;
		if (cerveja == null) {
			if (other.cerveja != null)
				return false;
		} else if (!cerveja.equals(other.cerveja))
			return false;
		return true;
	}

}
