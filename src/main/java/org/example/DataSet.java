package org.example;

import java.util.Collection;
import java.util.Set;
import java.util.HashSet;


public class DataSet extends HashSet implements Set,Collection {


    public static void main(String[] args) {

        HashSet<String >setting=new HashSet<String>();
        setting.add("ADP");
        setting.add("ADT");
        setting.add("ITS");
        setting.add("PRT");
        System.out.println("Majors Subject codes for ICT are : " +setting);
    }


}
