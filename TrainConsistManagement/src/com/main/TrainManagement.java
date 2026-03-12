/**
 * @author Amit
 * @version 14.0
 * 
 * Here we are taking input as Cargo type and capacity
 * and validating the capacity using try catch
 * if capacity <= 0 then it will throw error
 */
package com.main;

import com.service.*;
import com.validation.*;

import java.util.Scanner;

public class TrainManagement {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Train consist Management System");
		System.out.println();
		
		TrainConsist train = new TrainConsist();
		
		while(true) {
			System.out.println("1. Add Bogie");
			
			System.out.println("2. Exit");
			
			
			System.out.print("Enter choice: ");
			int choice = sc.nextInt();
			
			sc.nextLine();
			
			switch(choice) {
			case 1:
				System.out.print("Enter Bogie Type: ");
				String bogieType = sc.nextLine();
				
				System.out.print("Enter Capacity: ");
				
				try {
					int capacity = sc.nextInt();
					train.addBogie(bogieType, capacity);
				}
				catch (NumberFormatException e){
					System.out.println("Error : Capacity should be an integer");
				}
				catch (InvalidCapacityException e){
					System.out.println("\nError : "+e.getMessage());
				}
				
				break;
			
			case 2:
				return;
			}
			
			
			
			
		}
		
		
		
		
		
		
		
	}
}

