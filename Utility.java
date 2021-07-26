package com.bridgelabz;

public class Utility {
    static int binarySearchAlgo(String UserStringArray[], String check)
    {
        int left=0;
        int right=UserStringArray.length-1;
        while(left<=right)
        {
            int middle = left+(right-1)/2;
            //checking the string using compareTo
            int temp = check.compareTo(UserStringArray[middle]);
            if(temp==0)
                return middle;
            if(temp>0)
                left=middle+1;
            else {
                right=middle-1;
            }
        }
        return -1;
    }
    //method for insertion sort
    public static void insertionSort(String[] str, int n){
        for (int i=1 ;i<n; i++)
        {
            String temp = str[i];

            int j = i - 1;
            while (j >= 0 && temp.length() < str[j].length())
            {
                str[j+1] = str[j];
                j--;
            }
            str[j+1] = temp;
        }
    }

    //method to print sorted elements
    public static <t>void printArray(t[] str, int n ){
        for (int i=0; i<n; i++)
            System.out.print(str[i]+" ");
    }
}