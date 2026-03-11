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
	
	public void addBogie(String Bogietype, int capacity) {
		bogie.add(new Bogie(Bogietype, capacity));
		
		System.out.println(Bogietype + "Bogie added with capacity: " + capacity);
	}
	
	
	public void displayTrainState() {
		System.out.println("Train State: " + bogie);
	}
	
	public void groupBogies() {
		Map<String, List<Bogie>>  groupedBogies = bogie.stream().collect(Collectors.groupingBy(b -> b.getBogieType()));
		
		System.out.println("Bogies after grouping..");
		
		for(Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
			System.out.println("Bogie Type " + entry.getKey() + "\n" + entry.getValue());
		}
		
		
	}
	
	
}
