package com.main;

import com.service.*;

public class TrainManagement {
	public static void main(String[] args) {
		System.out.println("Train consist Management System");
		System.out.println();
		
		TrainConsist train = new TrainConsist();
		
		System.out.println("Initial Bogie count: " + train.getBogieCount());
		
		train.displayTrainState();
	}
}
