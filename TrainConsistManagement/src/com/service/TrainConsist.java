package com.service;


//import java.util.ArrayList;
//import java.util.List;

import java.util.Set;
import java.util.HashSet;

import com.model.*;
public class TrainConsist {
	private HashSet<String> bogies;
	
	public TrainConsist() {
		bogies = new HashSet<>();
	}
	
	public int getBogieCount() {
		return bogies.size();
	}
	
	public void addBogie(String bogieId) {
//		Bogie bogie = new Bogie(bogieId);
		bogies.add(bogieId);
		
		System.out.println(bogieId + "Bogie added..");
	}
	
	public void removeBogie(String type) {
		
			if(bogies.contains(type)) {
				bogies.remove(type);
				System.out.println(type + "Bogie removed");
				return;
			}
			
		
		System.out.println("Bogie not found");
	}
	
	public void checkBogie(String type) {
		boolean found = false;
		
		
			if(bogies.contains(type)) {
				found = true;
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
