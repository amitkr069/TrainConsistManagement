package com.service;

import com.model.*;
import java.util.List;
import java.util.ArrayList;

import com.validation.*;

public class TrainConsist {

	private List<Bogie> bogie;
	
	
	public TrainConsist() {
		bogie = new ArrayList<>();
		
	}
	
	public int getBogieCount() {
		return bogie.size();
	}
	
	public void addBogie(String Bogietype, String shape) throws CargoSafetyException{
		
		bogie.add(new Bogie(Bogietype, shape));
		
		System.out.println(Bogietype + "shape: " + shape);
	}
	
	
	public void displayTrainState() {
		System.out.println("Train State: " + bogie);
	}
	
}