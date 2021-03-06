package com.stackroute.pe3;

import org.junit.*;

import static org.junit.Assert.*;

public class RemoveVowelsTest {
       RemoveVowels vowel;
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
            vowel=new RemoveVowels();

            System.out.println("Inside Before");

        }

        @After
        public void tearDown()
        {
            //arrange
            vowel=null;

            System.out.println("Inside After");

        }

        @Test
        public void Vowels()
        {
            assertArrayEquals(new String[]{"hll","h","by","sm","txt"}, vowel.ReadString(new String[]{"5", "hello", "hi", "bye", "some", "text"}));
            assertArrayEquals(new String[]{""}, vowel.ReadString(new String[]{"1","a"}));
            assertArrayEquals(new String[]{"",""}, vowel.ReadString(new String[]{"2", "aeiou", "ae"}));
        }
        @Test
       public void check()
        {
            assertArrayEquals(new String[]{"String should contain only letter","h","String should contain only letter","sm","txt"}, vowel.ReadString(new String[]{"5", "h55lo", "hi", "b0e", "some", "text"}));
            assertArrayEquals(new String[]{"Strings cannot be null","h","String should contain only letter","Strings cannot be null","txt"}, vowel.ReadString(new String[]{"5", "", "hi", "b0e", "", "text"}));
        }

    }

