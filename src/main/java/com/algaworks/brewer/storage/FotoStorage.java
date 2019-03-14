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

	
	public void salvarTemporariamente(MultipartFile[] files);
}
