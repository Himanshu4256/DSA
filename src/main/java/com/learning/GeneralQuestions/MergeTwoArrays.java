package com.learning.GeneralQuestions;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int arr1[] = {2, 5, 1, 3, 8, 5};
        int arr2[] = {6, 7, 4, 1, 9, 2};

        // 1. The new length must be the SUM of both lengths
        int newArr[] = new int[arr1.length + arr2.length];

        // 2. Copy elements from the first array
        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
        }

        // 3. Copy elements from the second array
        // We start at arr1.length so we don't overwrite the first set
        for (int i = 0; i < arr2.length; i++) {
            newArr[arr1.length + i] = arr2[i];
        }

        // 4. Print the result
        for(int i = 0; i < newArr.length; i++){
            System.out.print(newArr[i] + (i < newArr.length - 1 ? ", " : ""));
        }
    }
}