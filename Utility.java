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

}
