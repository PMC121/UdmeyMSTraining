package com.brewery.model;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BeerModel {

	private UUID id;
	private String beerName;
	private String beerStyle;
	private int upc;
}
