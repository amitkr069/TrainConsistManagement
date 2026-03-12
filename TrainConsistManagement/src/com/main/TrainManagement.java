/**
 * @author Amit
 * @version 16.0
 * 
 * Here we are taking input as capacities
 * and sorting the capacities using bubble sort
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
		
		System.out.println("Enter size: ");
		int n = sc.nextInt();
		
		train.addBogie(n);
		System.out.println("Original Capacities");
		
		train.displayTrainState();
		
		System.out.println();
		
		System.out.println("Sorted capacities.");
		train.sortCapacity();
		train.displayTrainState();
	
	}
}

