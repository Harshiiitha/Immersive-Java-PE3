package com.stackroute.pe3;

import org.junit.*;

import static org.junit.Assert.*;

public class StudentMarksTest {

   StudentMarks marks;
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
           marks=new StudentMarks();

            System.out.println("Inside Before");

        }

        @After
        public void tearDown()
        {
            //arrange
            marks=null;

            System.out.println("Inside After");

        }

        @Test
        public void input()
        {

            String result=marks.checkStuGrades(-1);
            //assert
            assertEquals("Input should be greater than 0",result);
        }
    @Test
    public void input1()
    {

        String result=marks.checkStuGrades(105);
        //assert
        assertEquals("Input should be less than 100",result);
    }
    @Test
    public void input2()
    {

        String result=marks.checkStuGrades(80);
        //assert
        assertEquals("true",result);
    }






}