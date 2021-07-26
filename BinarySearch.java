package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;
import static com.bridgelabz.Utility.binarySearchAlgo;

public class BinarySearch {
     //Main Method
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter list of word separated by comma ',' :");
        String userString = sc.next();
        String[] userStringArray = userString.split(",");
        Arrays.sort(userStringArray);
        System.out.println("Enter the word to check :");
        String check = sc.next();
        //Checking binarySearchAlgo utilityClass & storing in result
        int result = binarySearchAlgo(userStringArray, check);
        if(result == -1)
        {
            System.out.println("word not present");
        }
        else
            System.out.println(" word present at index : "+result);

        sc.close();
    }

}