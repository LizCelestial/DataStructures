package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;
public class DataListTest extends ArrayList implements List, Collection {

    List<String> list1 = Arrays.asList("Name", "Surname", "Student_Number", "Course");
    List<String> list2 = Arrays.asList("Name", "Surname", "Student_Number", "Course");
    List<String> list3 = Arrays.asList("Name", "Surname", "Course", "Student_Number");


    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void ListTestingForEquality_ShouldBeEqual()
    {
        Assert.assertEquals("Name", list1.get(0));
        Assert.assertEquals("Surname", list1.get(1));
        Assert.assertEquals("Student_Number", list1.get(2));
        Assert.assertEquals("Course", list1.get(3));
        assertTrue(list1.size()==4);


    }

    @Test
    public void TwoListTest_ShouldBeEqual()
    {
       Assert.assertEquals(list1,list2);


    }



}