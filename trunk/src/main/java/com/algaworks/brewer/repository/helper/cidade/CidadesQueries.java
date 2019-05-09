/**
 * 9 de mai de 2019
 * brewer
 * ailto
 */
package com.algaworks.brewer.repository.helper.cidade;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.algaworks.brewer.model.Cidade;
import com.algaworks.brewer.repository.filter.CidadeFilter;

/**
 * @author ailto
 *
 */
public interface CidadesQueries {
	public Page<Cidade> filtrar(CidadeFilter filtro, Pageable pageable);
}
