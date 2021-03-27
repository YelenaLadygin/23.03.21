package com.company;
import java.util.Collections;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //1
        LocalDateTime date1 = LocalDateTime.of(1970, 12, 19, 00, 45, 3);
        System.out.println(date1);
        DateTimeFormatter form = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println(date1.format(form));

        //3 + //4
        ArrayList<Continent> continents = new ArrayList<>();
        continents.add(new Continent("Asia", 450000.99, 9000000));
        continents.add(new Continent("America", 1009000.0, 6500000));
        continents.add(new Continent("Europe", 125888.00, 1115000));

        Collections.sort(continents);
        System.out.println("======== before sort ==========");
        continents.stream()
                .forEach(System.out::println);

        Collections.sort(continents, new ContentPopulationCompare());
        System.out.println("\n======== after sort by population ==========");
        continents.stream()
                .forEach(System.out::println);

        Collections.sort(continents, new ContinentSizeCompare());
        System.out.println("\n======== after sort by size ==========");
        continents.stream()
                .forEach(System.out::println);

        Collections.sort(continents, new CompareBySizeAndNumberOfPeople());
        System.out.println("\n======== after sort by size and population ==========");
        continents.stream()
                .forEach(System.out::println);

        //11
        Stack<String> greeringStack = new Stack<>();
        greeringStack.push("good");
        greeringStack.push("morning");
        greeringStack.push("to");
        greeringStack.push("you");
        greeringStack.push(":-)");

        greeringStack.stream().forEach(System.out::println);
        System.out.println("---------------------");
        String item = greeringStack.pop();
        System.out.println(item);
        System.out.println(greeringStack.peek());
        greeringStack.add("i am glad to see you");
        System.out.println(greeringStack.peek());

   //12
        Queue<Double> doublenumbers = new ArrayDeque<>();
        doublenumbers.add( 55.77);
        doublenumbers.add( 112.77);
        doublenumbers.add( 999.55);
        doublenumbers.stream().forEach(System.out::println);
        double c = doublenumbers.poll();
        System.out.println("Removed Element: " + c);
        doublenumbers.peek();
        doublenumbers.stream().forEach(System.out::println);
        doublenumbers.clear();

        //21
        try {
            foo();
        }
        catch (Exception e)
        {
            System.out.println("was safely caught in main...");
        }
        System.out.println("hello there ...");
    }
    private static void foo() {
        int a = 1;
        int b = 0;
        goo(a, b);
    }
    private static void goo(int a, int b) {
        int c = a / b;
    }
    

    }

















