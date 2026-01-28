package com.product.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.models.Alien;
import com.product.repository.AlienRepository;

@RestController
public class AlienController {

	@Autowired
	AlienRepository repo;
	
	@GetMapping("/aliens")
	public List<Alien> getAliens() {
		return repo.findAll();
	}
	
	@GetMapping("/alien/{aname}")
	public Alien getAlien(@PathVariable String aname) {
		System.out.println("method called");
		//int i=7/0;   // even with this exception After log will be printed as by default it is finally
		return repo.findByAname(aname);
	}
	
	@PostMapping("/alien")
	public Alien addAlien(@RequestBody Alien alien) {
		repo.save(alien);
		return alien;
	}
	
}
