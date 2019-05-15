package com.stackroute.pe3;

import org.junit.*;

import static org.junit.Assert.*;

public class StringArraysTest {
    StringArrays test;
    @BeforeClass
    public static void setUpBeforeClass()
    {

        System.out.println("Inside BeforeClass");

    }

    @AfterClass
    public static void tearDownAfterClass()
    {


        System.out.println("Inside AfterClass");

    }

    @Before
    public void setUp()
    {
        //arrange
        test=new StringArrays();

        System.out.println("Inside Before");

    }

    @After
    public void tearDown()
    {
        //arrange
        test=null;

        System.out.println("Inside After");

    }

    @Test
    public void checkArrays()
    {   //Test Scenario1
        assertArrayEquals(new String[]{"hello","hiii","some"}, test.removeDuplicate1(new String[]{"hello", "hiii", "hello", "some", "hello"}));
        //Test Scenario2
        assertArrayEquals(new String[]{"PakistanIndia","LondonIndia"},test.appendString(new String[]{"India", "Germany"},new String[]{"Pakistan","London"}));
        //Test Scenario3
        assertArrayEquals(new String[]{"equal","not equal"}, test.compareArrays(new String[]{"India","Pakistan"},new String[]{"India","London"}));
        //Test Scenario4
        assertArrayEquals(new String[]{"India","America","London"}, test.removeDuplicate(new String[]{"India", "America", "London", "India", "America"}));
        //Test Scenario5
        assertArrayEquals(new String[]{"IndiaIndia","AmericaIndia","LondonIndia","IndiaIndia","AmericaIndia"},test.appendString(new String[]{"India", "America", "London", "India", "America"},new String[]{"India", "America", "London", "India", "America"}));
        //Test Scenario6
        assertArrayEquals(new String[]{"LondonIndia","LondonAmerica","LondonLondon","LondonIndia","LondonAmerica"},test.prependString(new String[]{"India", "America", "London", "India", "America"},new String[]{"India", "America", "London", "India", "America"}));

    }


}