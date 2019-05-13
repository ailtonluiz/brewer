/**
 * 13 de mai de 2019
 * brewer
 * ailto
 */
package com.algaworks.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ailto
 *
 */

@Controller
public class ErrorsController {

	@GetMapping("/404")
	public String paginaNaoEncontrada() {
		return "404";

	}

	@RequestMapping("/500")
	public String erroServidor() {
		return "500";
	}

}
