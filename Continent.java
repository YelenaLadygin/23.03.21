package com.company;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString

public class Continent implements Comparable<Continent> {
    protected String name;
    protected Double size;
    protected Integer population;

    public Continent(String name, Double size, Integer population) {
        this.name = name;
        this.size = size;
        this.population = population;
    }

    @Override
    public int compareTo(Continent o) {
        return 0;
    }
}