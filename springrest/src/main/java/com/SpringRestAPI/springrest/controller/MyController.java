package com.SpringRestAPI.springrest.controller;


import org.springframework.web.bind.annotation.RestController;

import com.SpringRestAPI.springrest.entity.Load;
import com.SpringRestAPI.springrest.services.LoadService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
public class MyController {
	
	@Autowired
	private LoadService loadService;
	
	@GetMapping("/home")
	public String home() {
		return "this is home page";
	}
	
	//GET  loads
	
	@GetMapping("/load")
	public List<Load> getLoad()
	{
		return this.loadService.getLoad();
	}
	
	@GetMapping("/load/{loadId}")
	public Load getLoadID(@PathVariable String loadId)
	{
		return this.loadService.getLoadID(Long.parseLong(loadId));
	}
	
	@PostMapping("/load")
	public Load addload(@RequestBody Load load)
	{
		return this.loadService.addload(load);
		
	}
	
	@PutMapping("/load")
	public Load updateLoad( @RequestBody Load Load)
	{
	   return this.loadService.updateLoad(Load);
	}
	
	@DeleteMapping("/load/{loadId}")
	public ResponseEntity<HttpStatus> deleteLoad(@PathVariable String loadId){
	
		try {
			this.loadService.deleteLoad(Long.parseLong(loadId));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	

}
