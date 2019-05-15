package com.stackroute.pe3;

import org.junit.*;

import static org.junit.Assert.*;

public class CheckConsecutiveTest {
  CheckConsecutive check;
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
            check=new CheckConsecutive();

            System.out.println("Inside Before");

        }

        @After
        public void tearDown()
        {
            //arrange
            check=null;

            System.out.println("Inside After");

        }

        @Test
        public void input()
        {

            String input="0,-1,-2,-3,-4,-5";
            String result=check.consecutive(input);
            //assert
            assertEquals("consecutive numbers",result);
        }
        @Test
    public void input1()
    {

        String input="6,6,6,6,6,6";
        String result=check.consecutive(input);
        //assert
        assertEquals("non consecutive numbers",result);
    }
    @Test
    public void input2()
    {

        String input="54,53,52,51,50,49,48";
        String result=check.consecutive(input);
        //assert
        assertEquals("consecutive numbers",result);
    }
    @Test
    public void input3()
    {

        String input="98,96,95,94,93";
        String result=check.consecutive(input);
        //assert
        assertEquals("non consecutive numbers",result);
    }

    }



