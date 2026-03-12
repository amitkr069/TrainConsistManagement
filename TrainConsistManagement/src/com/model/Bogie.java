package com.model;

import com.validation.*;

public class Bogie {

    private String bogieType;
    private String shape;

    public Bogie(String bogieType, String shape) throws CargoSafetyException {
    	
    	if(bogieType.equalsIgnoreCase("Petroleum") && !shape.equalsIgnoreCase("Cylindrical")) {
    		throw new CargoSafetyException("Unsafe Cargo Assignment...");
    	}
        this.bogieType = bogieType;
        this.shape = shape;
    }

    public String getBogieType() {
        return bogieType;
    }

    public String getShape() {
    	return shape;
    }

    @Override
    public String toString() {
        return bogieType + "shape -> " + shape;
    }
}