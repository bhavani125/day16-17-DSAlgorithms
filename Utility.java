package com.bridgelabz;

import static com.bridgelabz.BubbleSort.userArray;

public class Utility {


    //Creating method for binarySearch Algorithm
    static int binarySearchAlgo(String UserStringArray[], String check) {
        int left = 0;
        int right = UserStringArray.length - 1;
        while (left <= right) {
            int middle = left + (right - 1) / 2;
            //checking the string using compareTo
            int temp = check.compareTo(UserStringArray[middle]);
            if (temp == 0)
                return middle;
            if (temp > 0)
                left = middle + 1;
            else {
                right = middle - 1;
            }
        }
        return -1;
    }

    //Creating method for bubbleSort
    static void bubbleSort() {
        int temp = 0;
        int n = userArray.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (userArray[j - 1] > userArray[j]) {
                    temp = userArray[j - 1];
                    userArray[j - 1] = userArray[j];
                    userArray[j] = temp;
                }
            }

        }
    }

    //Creating PrintArray method for bubbleSort
    static void printArray() {
        for (int i = 0; i < userArray.length; i++) {
            System.out.print(userArray[i] + " ");
        }
    }

    //Creating insertionSort  method
    public void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    //Creating print method to print insertion array
     static void print(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++)
            System.out.println(arr[i] + "");
    }
}
