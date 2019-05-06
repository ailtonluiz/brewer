/**
 * 6 de mai de 2019
 * brewer
 * ailto
 */
package com.algaworks.brewer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.brewer.model.Estado;

/**
 * @author ailto
 *
 */
public interface Estados extends JpaRepository<Estado, Long> {

}
