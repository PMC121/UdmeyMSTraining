package com.brewery.controller;

import java.util.UUID;

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

import com.brewery.model.BeerModel;
import com.brewery.service.BeerService;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

	@Autowired
	private BeerService beerService;
	
	
	@GetMapping("/{id}")
	public ResponseEntity<BeerModel> getBeer(@PathVariable("id") UUID beerid){
		return new ResponseEntity<BeerModel>(beerService.getBeer(beerid), HttpStatus.OK);
		
	}
	
	@PostMapping()
	public ResponseEntity addBeerStock(@RequestBody BeerModel beerModel)
	{
		beerService.addBeer(beerModel);
		return new ResponseEntity<>(HttpStatus.CREATED);
		
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<BeerModel> updateBeerStock(@PathVariable("id") UUID id,  @RequestBody BeerModel beerModel)
	{
		BeerModel beerModels=beerService.updateBeer(id,beerModel);
		return new ResponseEntity<>(beerModels,HttpStatus.NO_CONTENT);
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<HttpStatus> removeBeer(@PathVariable("id") UUID id)
	{
		if(beerService.deleteBeer(id)==1)
		{
			return new ResponseEntity<>(HttpStatus.OK);
		}
		
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
	}
}
