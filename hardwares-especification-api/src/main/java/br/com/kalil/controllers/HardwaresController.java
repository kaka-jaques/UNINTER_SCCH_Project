package br.com.kalil.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.kalil.object.CPU;
import br.com.kalil.repository.CPURepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class HardwaresController {

	@Autowired
	private CPURepository cpuRepository;
	
	@PostMapping("/cpu")
	public void setCpu(@RequestBody CPU body) {
		cpuRepository.save(body);
	}
	
}
