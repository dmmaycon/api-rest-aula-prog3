package dev.dmmaycon.apiaula.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.dmmaycon.apiaula.models.Aula;
import dev.dmmaycon.apiaula.repositorys.AulaRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/aulas")
public class AulaResource {
	
	@Autowired
	AulaRepository aulaRepository;

	@GetMapping
	public List<Aula> show() {		
		return aulaRepository.findAll();
	}
	
}
