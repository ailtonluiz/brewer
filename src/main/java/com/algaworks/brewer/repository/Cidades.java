/**
 * 7 de mai de 2019
 * brewer
 * ailto
 */
package com.algaworks.brewer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.brewer.model.Cidade;

/**
 * @author ailto
 *
 */
public interface Cidades extends JpaRepository<Cidade,Long>{
	
	public List<Cidade> findByEstadoCodigo(Long codigoEstado);

}
