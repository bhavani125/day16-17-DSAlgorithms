package com.bridgelabz;

public class InsertionSort {
             //Main Method
            public static void main(String args[])
            {
                int arr[]={12,11,13,5,6};
                //Creating obj for utility class
                Utility utilityObj = new Utility();
                //calling sort method here
                utilityObj.insertionSort(arr);
                //Calling printArray method here
                utilityObj.print(arr);
            }
        }

