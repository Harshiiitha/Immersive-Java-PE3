package com.stackroute.pe3;
import java.io.*;
import java.util.*;
public class CheckConsecutive {
    public static void main(String[] args)
    {
        int numOfInputs=7;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String input=sc.next();
        String output=consecutive(input);
        System.out.println(output);
    }
    public static String consecutive(String  input)
    {
        String[] parts=input.split(",");
        int[] parts1=new int[parts.length];
        boolean result=true;
        for(int i=0;i<parts.length;i++)
        {
            parts1[i] = Integer.parseInt(parts[i]);
        }
        for(int i=0;i<parts1.length-1;i++)
        {
            if (((parts1[i + 1] - parts1[i]) == 1)||((parts1[i + 1] - parts1[i]) == -1)) {
            } else {
                result = false;
                break;
            }
        }
        if(result)
        {
            return "consecutive numbers";
        }
        else
        {
            return "non consecutive numbers";
        }
    }

}
