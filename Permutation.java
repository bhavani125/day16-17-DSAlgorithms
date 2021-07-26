package com.bridgelabz;

public class Permutation {
    //MainMethod
    public static void main(String[] args)
    {
        String str = "bhavani";
        //check the length of a string
        int n = str.length();
        //Creating object permutation
        Permutation permutation = new Permutation();
        //calling permute method
        permutation.permute(str, 0, n - 1);
    }
    //method for calculate permutation string
     void permute(String str, int start, int last) {
        if (start == last) {
            System.out.println(str);
        } else {
            for (int i = start; i < last; i++) {
                str = swap(str, start, i);
                permute(str, start + 1, last);
                str = swap(str, start, i);
            }
        }
    }

    //Creating swap method for  characters at a particular  position.
    public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
