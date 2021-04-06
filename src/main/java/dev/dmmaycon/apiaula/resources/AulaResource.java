package dev.dmmaycon.apiaula.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/aula")
public class AulaResource {

	@GetMapping("/hello")
	public List<String> listaHello() {
		List<String> lista = new ArrayList<String>();
		lista.add("Programação 1");
		lista.add("Programação 2");
		lista.add("Programação 3");
		return lista;
	}
	
}
