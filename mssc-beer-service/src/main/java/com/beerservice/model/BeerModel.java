package com.beerservice.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerModel {

	private UUID id;
	private Integer version;
	
	private OffsetDateTime createdDate;
	private OffsetDateTime modifyedDate;
	
	private String beerName;
	private BeerStyleEnum beerStyle;
	
	private int upc;
	private BigDecimal price;
	
	private Integer quantityInHand;
}
