package com.service;

import java.util.Arrays;
import java.util.Scanner;


public class TrainConsist {

	private String[] bogieId;
	
	
	Scanner sc = new Scanner(System.in);
	
	public TrainConsist(int size) {
		bogieId = new String[size];
	}
	
	public void addBogie() {
		for(int i = 0; i<bogieId.length; i++) {
			
			System.out.print("Enter Bogie Id: ");
			String type = sc.nextLine();
			
			bogieId[i] = type;
		}
		
	}
	
	public void displayBogie() {
		System.out.println(Arrays.toString(bogieId));
	}
	
	public void searchBogie(String id) {
		boolean found = false;
		
		for(int i = 0; i<bogieId.length; i++) {
			if(bogieId[i].equals(id)) {
				found = true;
				break;
			}
		}
		
		if(found) {
			System.out.println("Bogie " + id + " found in Train consist");
		}
		else {
			System.out.println("Bogie " + id + " not found in Train consist");
		}
	}
		
}