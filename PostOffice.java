package com.company;

import lombok.AllArgsConstructor;
import lombok.ToString;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class PostOffice  {

    protected ArrayList<Box> boxes = new ArrayList<Box>() ;
    protected Queue<String> customers = new ArrayDeque<>() ;


    public PostOffice () {
        boxes.add(new Box("Phone", "yelena" ));
        boxes.add(new Box("IPhone", "yosi" ));
        boxes.add(new Box("Phone3", "yelena3" ));
        boxes.add(new Box("Phone5", "yelena4" ));
        boxes.add(new Box("Phone6", "yelena5" ));
        customers.add("yelena");
        customers.add("yosi");
        customers.add("yelena3");
        customers.add("yelena4");
        customers.add("yelena5");
    }
    public void printPostoffice (){
        System.out.print(boxes);
        System.out.print(customers);
    }

    public void newBoxArrived (Box content) {
        boxes.add(content);
    }
    public void newCustomerArrived (String c ){
       customers.add(c);
    }

    public String serveNextCustomer( ) {
        Box currentBox = null;
        String currentCustomer = customers.poll();
        System.out.print(boxes.get(3).owner);
        for (int index = 0; index < boxes.size(); index++) {
            currentBox = boxes.get(index);
            if (currentBox.owner == currentCustomer)
            {
                System.out.print(currentBox.content);
            }
        }
        return currentBox.content;
    }
}
