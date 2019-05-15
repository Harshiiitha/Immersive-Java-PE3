package com.stackroute.pe3;
import java.io.*;
import java.util.*;
public class ArrayProgram {
    public String [] checkEvenOdd(int[] input)
    {
        int size=input[0];
        String[] output=new String[size];
        int i=0,j=0;
        for(i=1,j=0;i<=size;i++)
        {
            if(input[i]%2==0)
            {
                output[j]="Even";
                j++;
            }
            else
            {
                output[j]="Odd";
                j++;

            }
        }
        return output;
    }
    public int[] RemovePrime(int[] input)
    {
        int size=input[0];
        int[] output=new int[size];
        int i=0,j=0,k=0;
        boolean flag=false;
        for(i=1;i<=size;i++)
        {
            for(j=2;j<input[i];j++)
            {    flag=false;
                if((input[i]%j)==0)
                {   flag=true;
                    break;
                }
            }
            if(flag)
            {
                output[k]=input[i];
                k++;
            }

        }
        int[] output1=new int[k];
        for(i=0;i<k;i++)
        {
            output1[i]=output[i];
        }
        return output1;
    }
    public static int[] ReverseArray(int[] input)
    {
        int size=input[0];
        int[] output=new int[size];
        int i=0,j=0,k=0;
        for(i=size;i>=1;i--)
        {
            output[j]=input[i];
            j++;
        }

        return output;
    }
}
