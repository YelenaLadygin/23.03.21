package com.company;

import java.util.HashMap;

public class Library {
    protected HashMap<String, Integer> BooksMap = new HashMap<String, Integer>();

    public void addNewBook(String book, int shelf) {
        BooksMap.put(book, shelf);
    }

    public  int searchForBook(String book) {
           if(BooksMap.containsKey(book)){
               int shelfNumber= BooksMap.get(book);
               return shelfNumber;
        } return -1;
    }

     public void removeBook (String book) {
         for (int index = 0; index < BooksMap.size(); index++) {
             int a = BooksMap.get(book);
             if (index == a) {
                 BooksMap.remove(book);
             } else System.out.println("This book is not in the library");
         }
     }
     public void countBooks () {
             for (int index = 0; index < BooksMap.size(); index++) {
                 System.out.print(index);
             }
         }

    }

