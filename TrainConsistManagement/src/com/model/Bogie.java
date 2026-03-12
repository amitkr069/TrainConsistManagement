package com.model;

import com.validation.*;

public class Bogie {

    private String bogieType;
    private int capacity;

    public Bogie(String bogieType, int capacity) throws InvalidCapacityException {
    	
    	if(capacity <= 0) {
    		throw new InvalidCapacityException("Capacity must me greater than 0");
    	}
        this.bogieType = bogieType;
        this.capacity = capacity;
    }

    public String getBogieType() {
        return bogieType;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return bogieType + "capacity " + capacity;
    }
}