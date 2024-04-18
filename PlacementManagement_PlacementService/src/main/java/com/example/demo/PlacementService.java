package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PlacementService {
	@Autowired
	private PlacementRepository repository;
	
	public List<Placement> showAll(){
		return repository.findAll();
	}
	
	public void save(Placement placement) {
		repository.save(placement);
	}
	
	public Placement get(Long id) {
		return repository.findById(id).get();
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	

}
