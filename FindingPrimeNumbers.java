package com.bridgelabz;

import java.util.Scanner;

public class FindingPrimeNumbers {
    //main method
    public static void main(String[] args) {
        FindingPrimeNumbers primeNoRange=new FindingPrimeNumbers();
        primeNoRange.findPrimeNo();

    }
    //method to calculate prime no between given Range
    public void findPrimeNo()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no : ");
        int start = sc.nextInt();
        System.out.print("Enter last no : ");
        int last = sc.nextInt();
        System.out.println("Prime numbers" + start + " and " + last + " are : ");
        int count;
        for (int i = start; i <= last; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    count = count + 1;
            }
            if (count == 2)
                System.out.println(i);
        }
    }
}

