package com.brewery.service;

import java.util.UUID;

import com.brewery.model.BeerModel;

public interface BeerService {

	public BeerModel getBeer(UUID id);

	public void addBeer(BeerModel beerModel);

	public BeerModel updateBeer(UUID id, BeerModel beerModel);

	public int deleteBeer(UUID id);
}
