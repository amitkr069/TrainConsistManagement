/**
 * @author Amit
 * @version 10.0
 * 
 * Here we are creating a list of bogies with capacity.
 * then using stream API to get the sum of the total capacity
 * 
 */
package com.main;

import com.service.*;

import java.util.Scanner;

public class TrainManagement {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Train consist Management System");
		System.out.println();
		
		TrainConsist train = new TrainConsist();
		
		while(true) {
			System.out.println("1. Add Bogie");
			System.out.println("2. See Train");
			System.out.println("3. Get sum of the capacity");
			System.out.println("4. Exit");
			
			
			System.out.println("Enter choice");
			int choice = sc.nextInt();
			
			sc.nextLine();
			
			
			switch(choice) {
			case 1:
				
				System.out.print("Enter Bogie Type: ");
				String type = sc.nextLine();
				
				System.out.println("Enter capacity: ");
				int capacity = sc.nextInt();
				sc.nextLine();
				
				train.addBogie(type, capacity);
				break;
			
			case 2:
				train.displayTrainState();
				break;
			case 3:
				train.sumOfCapacity();
				break;
			case 4:
				return;
			}
			
			
		}
				
		
	}
}

