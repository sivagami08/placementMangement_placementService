package com.example.demo;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/Placement")
public class PlacementContoller {
	
	
	@Autowired
	private PlacementService service;
	
	@GetMapping()
	public List<Placement> list(){
		return service.showAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Placement> get(@PathVariable Long id){
		try {
			Placement placement=service.get(id);
			return new ResponseEntity<Placement>(placement,HttpStatus.OK);
		}
		catch(NoSuchElementException e) {
			return new ResponseEntity<Placement>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping()
	public void save(@RequestBody Placement placment) {
		service.save(placment);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody Placement placement, @PathVariable Long id){
		try {
			Placement existed=service.get(id);
			service.save(placement);
			return new ResponseEntity<>(HttpStatus.OK);
		
		}
		catch(NoSuchElementException e){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		}
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
	
	
	
}
