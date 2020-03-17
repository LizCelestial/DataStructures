package org.example;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

public  class DataMap extends HashMap implements Map{


    public static void main(String[] args) {
        Map<String, String> mapA = new HashMap<String, String>();
        mapA.put("Name", "Liz");
        mapA.put("Surname", "Celeste");
        mapA.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);

        //___________________________________________________


        Map<String, String> mapB = new HashMap<String, String>();
        mapB.put("Name", "Liz");
        mapB.put("Surname", "Celeste");
        mapB.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);


    }



}
