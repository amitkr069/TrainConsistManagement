/**
 * @author Amit
 * @version 18.0
 * 
 * Here we are taking input as bogieID
 * and then taking user input to search for Id.
 * using linear search
 */
package com.main;

import com.service.*;

import java.util.Scanner;

public class TrainManagement {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Train consist Management System");
		System.out.println();
		
		
		
		System.out.println("Enter size: ");
		int n = sc.nextInt();
		
		sc.nextLine();
		
		TrainConsist train = new TrainConsist(n);
		
		train.addBogie();
		System.out.println("Original Bogies.");
		
		train.displayBogie();
		
		System.out.println();
		
		System.out.print("Enter bogie id to search: ");
		String id = sc.nextLine();
		
		train.searchBogie(id);
	
	}
}

