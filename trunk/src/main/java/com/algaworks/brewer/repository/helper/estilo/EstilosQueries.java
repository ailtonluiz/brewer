/**
 * 6 de mai de 2019
 * brewer
 * ailto
 */
package com.algaworks.brewer.repository.helper.estilo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.algaworks.brewer.model.Estilo;
import com.algaworks.brewer.repository.filter.EstiloFilter;

/**
 * @author ailto
 *
 */
public interface EstilosQueries {
	public Page<Estilo> filtrar(EstiloFilter filtro, Pageable pageable);
}
