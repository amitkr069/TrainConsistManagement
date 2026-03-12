/**
 * @author Amit
 * @version 13.0
 * 
 * Here we are taking input as Cargo type and capacity
 * and filtering cargo with capacity using both stream and loop
 * then checking performance comparison for both and displaying the results
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
			System.out.println("2. Performance Comparison");
			System.out.println("3. Exit");
			
			
			System.out.print("Enter choice: ");
			int choice = sc.nextInt();
			
			sc.nextLine();
			
			switch(choice) {
			case 1:
				System.out.print("Enter Bogie Type: ");
				String bogieType = sc.nextLine();
				
				System.out.print("Enter Capacity: ");
				int capacity = sc.nextInt();
				
				train.addBogie(bogieType, capacity);
				break;
			case 2:
				train.performanceComparison();
				break;
			case 3:
				return;
			}
			
			
			
			
		}
		
		
		
		
		
		
		
	}
}

