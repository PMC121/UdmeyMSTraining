package com.beerservice.controller;

import java.util.UUID;

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

import com.beerservice.model.BeerModel;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerServiceController {

	@GetMapping("/{beerId}")
	public ResponseEntity<BeerModel> getBeerById(@PathVariable("beerId") UUID beerId)
	{
		return null;
	}
	@PostMapping()
	public ResponseEntity saveBeer(@RequestBody BeerModel beerModel)
	{
		//beerService.addBeer(beerModel);
		return new ResponseEntity<>(HttpStatus.CREATED);
		
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<BeerModel> updateBeerStock(@PathVariable("id") UUID id,  @RequestBody BeerModel beerModel)
	{
		//BeerModel beerModels=beerService.updateBeer(id,beerModel);
		return new ResponseEntity<>(beerModel,HttpStatus.NO_CONTENT);
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<HttpStatus> removeBeer(@PathVariable("id") UUID id)
	{
//		if(beerService.deleteBeer(id)==1)
//		{
//			return new ResponseEntity<>(HttpStatus.OK);
//		}
		
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
	}
}
