package com.model;


public class Bogie {

    private int capacity;
//    private String shape;

    public Bogie(int capacity) {
    	
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }



    @Override
    public String toString() {
        return capacity + "";
    }
}