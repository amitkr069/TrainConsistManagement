package com.service;


import java.util.Comparator;
import com.model.Bogie;

public class BogieComparator implements Comparator<Bogie> {

    @Override
    public int compare(Bogie b1, Bogie b2) {
        return b1.getCapacity() - b2.getCapacity();
    }
}
