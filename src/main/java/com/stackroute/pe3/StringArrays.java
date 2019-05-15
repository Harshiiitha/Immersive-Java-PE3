package com.stackroute.pe3;
import java.io.*;
import java.util.*;
public class StringArrays {
    public static String[] removeDuplicate(String[] array1) {
        int i = 0, j = 0;
        String[] output=new String[array1.length];
        for (i = 0; i < array1.length - 1; i++) {
            for (j = i + 1; j < array1.length; j++) {
                if (array1[i] != null && array1[i].equals(array1[j])) {
                    array1[j] = null;
                }
            }
        }
        for (i = 0,j=0; i < array1.length; i++) {
            if (array1[i] != null) {
                output[j] = array1[i];
                j++;
            }
        }
            String[] output1=new String[j];
            for (i = 0; i < j; i++) {
                    output1[i]=output[i];
                }
        return output1;
    }
    public static String[] removeDuplicate1(String[] array2) {
        int i = 0, j = 0;
        String[] output=new String[array2.length];
        for (i = 0; i < array2.length - 1; i++) {
            for (j = i + 1; j < array2.length; j++) {
                if (array2[i] != null && array2[i].equals(array2[j])) {
                    array2[j] = null;
                }
            }
        }
        for (i = 0,j=0; i < array2.length; i++) {
            if (array2[i] != null) {
                output[j] = array2[i];
                j++;
            }
        }
            String[] output1=new String[j];
            for(i=0;i<j;i++)
            {
                output1[i]=output[i];
            }

        return output1;
    }
    public static String[] compareArrays(String[] array1,String[] array2)
    {   String[] output=new String[array1.length];
        int i=0,j=0;
        for(i=0;i<array1.length;i++)
        {
                if(array1[i].equals(array2[i]))
                {
                    output[j]="equal";
                    j++;

                }
                else
                {
                    output[j]="not equal";
                    j++;
                }


            }
        return output;
        }
    public static String[] appendString(String[] array1,String[] array2)
    {

        String[] output=new String[array2.length];
        String append=array1[0];
        int i;
        for(i=0;i<array2.length;i++)
        {
            output[i]=array2[i].concat(append);
        }
        return output;
    }
    public static String[] prependString(String[] array1,String[] array2)
    {
        String[] output=new String[array1.length];
        int mid=(array2.length)/2;int j=0;
        String prepend=array2[mid];
        int i;
        for(i=0;i<array2.length;i++)
        {
            output[i]=prepend.concat(array1[i]);

        }
       return output;

    }
}

