package com.stackroute.pe3;

import java.io.*;
import java.util.*;
public class StudentMarks {
    public static void main(String[] args) {
        int numOfStudents = 0, i = 0, j = 0, k = 0;
        System.out.println("Enter number of students");
        Scanner sc = new Scanner(System.in);
        numOfStudents = sc.nextInt();
        int[] stuGrades = new int[numOfStudents];
        for (i = 0; i < numOfStudents; i++) {
            System.out.println("Enter the grade");
            j = sc.nextInt();
            String output = checkStuGrades(j);
            if(output=="true")
            {
                stuGrades[i]=j;
            }
        }
        }

        public static String checkStuGrades( int j){
            if (j < 0) {
                return "Input should be greater than 0";
            } else if (j > 100) {
                return "Input should be less than 100";
            } else {
                return "true";
            }

        }
}