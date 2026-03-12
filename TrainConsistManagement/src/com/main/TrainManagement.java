/**
 * @author Amit
 * @version 17.0
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
		
		
		
		System.out.println("Enter size: ");
		int n = sc.nextInt();
		
		TrainConsist train = new TrainConsist(n);
		
		train.addBogie();
		System.out.println("Original Bogies.");
		
		train.displayBogie();
		
		System.out.println();
		
		train.sortBogie();
	
	}
}

