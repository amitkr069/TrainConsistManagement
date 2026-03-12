package com.service;

import com.model.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

import java.util.Map;
import com.validation.*;

public class TrainConsist {

	private List<Bogie> bogie;
//	private List<Bogie> newBogies;
	
	public TrainConsist() {
		bogie = new ArrayList<>();
		
	}
	
	public int getBogieCount() {
		return bogie.size();
	}
	
	public void addBogie(String Bogietype, int capacity) throws InvalidCapacityException{
		
		bogie.add(new Bogie(Bogietype, capacity));
		
		System.out.println(Bogietype + "capacity: " + capacity);
	}
	
	
	public void displayTrainState() {
		System.out.println("Train State: " + bogie);
	}
	
	public void filterBogiesUsingStream() {
		List<Bogie> newBogies1 = bogie.stream().filter(b -> b.getCapacity() > 60).collect(Collectors.toList());
		
		System.out.println("Filtered Bogies with capacity > 60");
		
//		for(Bogie b: newBogies) {
//			System.out.println(b);
//		}
	}
	
	public void filterBogiesUsingLoop() {
		List<Bogie> newBogies2 = new ArrayList<>();
		
		for(Bogie b: bogie) {
			if(b.getCapacity() > 60) {
				newBogies2.add(b);
			}
		}
	}
	
	
}