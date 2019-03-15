/**
 * 14 de mar de 2019
 * brewer
 * ailto
 */
package com.algaworks.brewer.storage;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author ailto
 *
 */
public interface FotoStorage {

	
	public String salvarTemporariamente(MultipartFile[] files);

	public byte[] recuperarFotoTemporaria(String nome);
}
