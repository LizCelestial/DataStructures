package org.example;

import org.hamcrest.core.Is;
import org.hamcrest.core.IsCollectionContaining;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class DataMapTest extends HashMap implements Map {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void MapTestingEquality(){

        Map<String, String> mapA = new HashMap<String, String>();
        mapA.put("Name", "Liz");
        mapA.put("Surname", "Celeste");


        Map<String,String>expected=new HashMap<>();
        expected.put("Name","Liz");
        expected.put("Surname","Celeste");

        //test size
        assertThat(mapA.size(),is (2));
        //test equality
        assertThat(mapA,is(expected));
        //test map key
//       assertThat(mapA, IsMapContaining.hasKey("Name"));
//        assertThat(mapA, IsMapContaining.hasValue("Celeste"));

//______________________________________________________________________________________________________________________

        Map<String, String> mapB = new HashMap<String, String>();
        mapB.put("Name", "Liz");
        mapB.put("Surname", "Celeste");


        //Testing if 2 maps are equal
        Assert.assertEquals(mapA,mapB);
        //Testing if Keys are true
        Assert.assertTrue(mapA.keySet().equals(mapB.keySet()));


    }
}