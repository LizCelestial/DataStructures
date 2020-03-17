package org.example;

import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.HashSet;

import static org.junit.Assert.*;
import java.util.HashSet;
import java.util.Set;


public class DataSetTest extends HashSet implements Set, Collection {



    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void main() {
        HashSet<String > setting=new HashSet<String>();
        setting.add("ADP");
        setting.add("ADT");
        setting.add("ITS");
        setting.add("PRT");

        //check if an element ITS exist
        assertTrue(setting.contains("ITS"));
        //  check size
        assertEquals(4,setting.size());


        //can remove object from the set
        int setSize=setting.size();
        assertTrue(setting.contains("PRT"));
        setting.remove("PRT");
        assertFalse(setting.contains("PRT"));
        assertEquals(setSize-1,setting.size());




    }
}