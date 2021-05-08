package com.beerservice.model;

import java.util.List;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

public class BeerPageList extends PageImpl<BeerModel>{

	public BeerPageList(List<BeerModel> content, Pageable pageable, long total) {
		super(content, pageable, total);
		// TODO Auto-generated constructor stub
	}
	public BeerPageList(List<BeerModel> content) {
		super(content);
		// TODO Auto-generated constructor stub
	}
   
}
