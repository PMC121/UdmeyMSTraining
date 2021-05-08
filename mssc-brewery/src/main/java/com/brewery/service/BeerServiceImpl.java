package com.brewery.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.brewery.model.BeerModel;

@Service
public class BeerServiceImpl implements BeerService {


	@Override
	public BeerModel getBeer(UUID id) {
		
		BeerModel beerModel=new BeerModel();
		beerModel.setId(id);
		beerModel.setBeerName("Vodaka");
		beerModel.setBeerStyle("Orange");
		beerModel.setUpc(11111);
		return beerModel;
	}

	@Override
	public void addBeer(BeerModel beerModel) {
		
	}

	@Override
	public BeerModel updateBeer(UUID id, BeerModel beerModel) {
		// TODO Auto-generated method stub
		return beerModel;
	}

	@Override
	public int deleteBeer(UUID id) {
		return 1;
	}

	
}
