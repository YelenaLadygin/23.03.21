package com.company;


import java.util.Comparator;

class ContinentSizeCompare implements Comparator<Continent> {

    @Override
    public int compare(Continent o1, Continent o2) {
        return o1.size.compareTo(o2.size);
    }
}




