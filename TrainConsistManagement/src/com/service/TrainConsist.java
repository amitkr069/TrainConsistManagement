package com.service;

import com.model.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class TrainConsist {

	private List<Bogie> bogie;
	Scanner sc = new Scanner(System.in);
	
	public TrainConsist() {
		bogie = new ArrayList<>();
		
	}
	
	public int getBogieCount() {
		return bogie.size();
	}
	
	public void addBogie(int n){
		
		for(int i = 0; i<n; i++) {
			System.out.print("Enter capacity: ");
			int capacity = sc.nextInt();
			bogie.add(new Bogie(capacity));
		}
			
	}
	
	
	public void displayTrainState() {
		System.out.println(bogie);
	}
	
	public void sortCapacity() {
	    for (int i = 0; i < bogie.size() - 1; i++) {
	        boolean swapped = false;
	        for (int j = 0; j < bogie.size() - i - 1; j++) {
	            if (bogie.get(j).getCapacity() > bogie.get(j + 1).getCapacity()) {
	                Bogie temp = bogie.get(j);
	                bogie.set(j, bogie.get(j + 1));
	                bogie.set(j + 1, temp);
	                swapped = true;
	            }
	        }
	        if (!swapped) break; // already sorted
	    }
	}
	
}