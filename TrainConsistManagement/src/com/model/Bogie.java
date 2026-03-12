package com.model;


public class Bogie {

    private String bogieType;
    private int capacity;

    public Bogie(String bogieType, int capacity) {
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