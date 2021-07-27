package com.bridgelabz;

import java.util.Scanner;

public class BubbleSort {
    static Scanner sc = new Scanner(System.in);
    static int[] userArray;
    private static int userInput() {
        int input = sc.nextInt();
        return input;
    }
    //Main method
    public static void main(String[] args) {
        Utility utilityObj=new Utility();
        System.out.println("How many values you want to enter: ");
        int size =userInput();
        userArray = new int[size];
        for (int i =0; i<size; i++){
            System.out.println("Enter the value: ");
            userArray[i]=userInput();
        }
        //printing method
        System.out.println("\nElements Before sorting :");
        //Calling printArray method here
        utilityObj.printArray();
        //Calling BubbleSort method here
        utilityObj.bubbleSort();
        System.out.println("\nElements After sorting :");
        //Calling printArray method here
        utilityObj.printArray();
    }
}
