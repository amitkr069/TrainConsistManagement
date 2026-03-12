package com.service;

import com.model.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class TrainConsist {

	private String[] bogieType;
	
	
	Scanner sc = new Scanner(System.in);
	
	public TrainConsist(int size) {
		bogieType = new String[size];
	}
	
	public void addBogie() {
		for(int i = 0; i<bogieType.length; i++) {
			
			System.out.println("Enter type");
			String type = sc.nextLine();
			
			bogieType[i] = type;
		}
		
	}
	
	public void displayBogie() {
		System.out.println(Arrays.toString(bogieType));
	}
	
	public void sortBogie() {
		Arrays.sort(bogieType);
		
		System.out.println("Bogies after sorting. ");
		displayBogie();
	}
	
	
	
}