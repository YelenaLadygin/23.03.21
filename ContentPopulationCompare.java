package com.company;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ContentPopulationCompare implements Comparator<Continent> {
    @Override
    public int compare(Continent o1, Continent o2) {
        return o1.population.compareTo(o2.population);
    }
}

