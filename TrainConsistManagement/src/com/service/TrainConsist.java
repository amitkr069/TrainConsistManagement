package com.service;

import com.model.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

import java.util.Map;


public class TrainConsist {

	private List<Bogie> bogie;
	
	public TrainConsist() {
		bogie = new ArrayList<>();
		
	}
	
	public int getBogieCount() {
		return bogie.size();
	}
	
	public void addBogie(String Bogietype, String cargoType) {
		bogie.add(new Bogie(Bogietype, cargoType));
		
		System.out.println(Bogietype + "-> " + cargoType);
	}
	
	
	public void displayTrainState() {
		System.out.println("Train State: " + bogie);
	}
	
	public boolean checkSafety() {
		
		return bogie.stream().allMatch(b -> !b.getBogieType().equalsIgnoreCase("Cylindrical") || 
				b.getCargoType().equalsIgnoreCase("Petroleum"));
		
	}
	
	
}