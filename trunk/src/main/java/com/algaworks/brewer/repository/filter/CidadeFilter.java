/**
 * 9 de mai de 2019
 * brewer
 * ailto
 */
package com.algaworks.brewer.repository.filter;

import com.algaworks.brewer.model.Estado;

/**
 * @author ailto
 *
 */
public class CidadeFilter {

	private Estado estado;
	private String nome;

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;

	}
}
