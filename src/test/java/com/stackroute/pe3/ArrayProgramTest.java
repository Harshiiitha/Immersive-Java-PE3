package com.stackroute.pe3;

import org.junit.*;

import static org.junit.Assert.*;

public class ArrayProgramTest {

        ArrayProgram test;
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
            test=new ArrayProgram();

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
        public void primePositive()
        {   //TestScenario1
            assertArrayEquals(new int[]{12,14,15,16}, test.RemovePrime(new int[]{6,12,13,14,15,16,17}));
            //TestScenario2
            assertArrayEquals(new int[]{16,15,14,13,12}, test.ReverseArray(new int[]{5,12,13,14,15,16}));
            //Test Scenario3
            assertArrayEquals(new String[]{"Even","Odd","Even","Odd","Even"}, test.checkEvenOdd(new int[]{5,12,13,14,15,16}));
            //Test Scenario4
            assertArrayEquals(new int[]{}, test.RemovePrime(new int[]{3,13,13,13}));
            //Test Scenario5
            assertArrayEquals(new int[]{15,14,14,13}, test.ReverseArray(new int[]{4,13,14,14,15}));
            //Test Scenario6
            assertArrayEquals(new int[]{12,14,15}, test.RemovePrime(new int[]{4,12,13,14,15}));
            //Test Scenario7
            assertArrayEquals(new String[]{"Even","Odd","Even","Odd"}, test.checkEvenOdd(new int[]{4,12,13,14,15}));
            //Test Scenario7
            assertArrayEquals(new int[]{15,14,13,12}, test.ReverseArray(new int[]{4,12,13,14,15}));

        }
  

    }





