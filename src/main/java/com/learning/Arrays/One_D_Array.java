package com.learning.Arrays;

import java.util.Scanner;

public class One_D_Array {
    public static void main(String[] args) {
        int i,n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter Values");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Given array as :");
        for (i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

    }
}
