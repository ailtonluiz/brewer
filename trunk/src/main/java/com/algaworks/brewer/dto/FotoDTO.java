/**
 * 14 de mar de 2019
 * brewer
 * ailto
 */
package com.algaworks.brewer.dto;

/**
 * @author ailto
 *
 */
public class FotoDTO {

	private String nome;
	private String contentType;

	public FotoDTO(String nome, String contentType) {
		super();
		this.nome = nome;
		this.contentType = contentType;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

}
