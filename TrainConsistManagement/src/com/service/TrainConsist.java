package com.service;

import com.model.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


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
	
	public void sortBogies() {
		Collections.sort(bogie, new BogieComparator());
	}
}
