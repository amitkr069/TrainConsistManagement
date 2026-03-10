package com.service;


import java.util.ArrayList;
import java.util.List;

import com.model.*;
public class TrainConsist {
	private ArrayList<Bogie> bogies;
	
	public TrainConsist() {
		bogies = new ArrayList<>();
	}
	
	public int getBogieCount() {
		return bogies.size();
	}
	
	public void addBogie(String type) {
		Bogie bogie = new Bogie(type);
		bogies.add(bogie);
		
		System.out.println(type + "Bogie added..");
	}
	
	public void removeBogie(String type) {
		for(Bogie b: bogies) {
			if(b.getBogieType().equalsIgnoreCase(type)) {
				bogies.remove(b);
				System.out.println(type + "Bogie removed");
				return;
			}
			
		}
		System.out.println("Bogie not found");
	}
	
	public void checkBogie(String type) {
		boolean found = false;
		
		for(Bogie b: bogies) {
			if(b.getBogieType().equalsIgnoreCase(type)) {
				found = true;
			}
			
		}
		if(found) {
			System.out.println(type + " Bogie exits in train");
		}
		else {
			System.out.println(type + " bogie does not exist in train");
		}
	}
	
	public void displayTrainState() {
		System.out.println("Current Train consist: " + bogies);
	}
}
