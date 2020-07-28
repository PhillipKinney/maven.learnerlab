package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {


    @Test
    public void testAdd(){
        //Given

        People people = new People();
        Person person1 = new Person(0L, null);
        Assert.assertFalse(people.contains(person1));

        //When
        people.add(person1);


        //Then
       Assert.assertTrue(people.contains(person1));
    }

    @Test
    public void testRemove(){
        //Given
        People people = new People();
        Person person1 = new Person(0L, null);

        people.add(person1);

        Assert.assertTrue(people.contains(person1));

        //When
        people.remove(person1);


        //Then
        Assert.assertFalse(people.contains(person1));
    }

    @Test
    public void testFindById(){
        //Given
        People people = new People();
        Person expected = new Person(0l, null);

        people.add(expected);
        Assert.assertTrue(people.contains(expected));

        //When
        Person actual = people.findById(expected.getId());

        //Then
        Assert.assertEquals(expected,actual);
    }

    }



