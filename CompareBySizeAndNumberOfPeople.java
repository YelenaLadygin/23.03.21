package com.company;

import java.util.Comparator;

public class CompareBySizeAndNumberOfPeople implements Comparator<Continent> {
    @Override
    public int compare(Continent o1, Continent o2) {
        int a = o1.size.compareTo(o2.size);
        if (a == 0) {
            return o1.population.compareTo(o2.population);
        } else return a;
    }
}
