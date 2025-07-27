package com.learning.Arrays;

import java.util.Scanner;

public class InsertIntoArray {
    public static void main(String[] args) {
        int n, m, p;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter values");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[n + 1];
        System.out.println("enter index of value to be inserted");
        m = sc.nextInt();

        System.out.println("enter value to insert");
        p = sc.nextInt();

        for (int i = 0; i < n+1; i++) {
            if (i < m) {
                b[i] = a[i];
            } else if (i == m) {
                b[i] = p;
            } else {
                b[i] = a[i-1];
            }
        }

        System.out.println("Inserted Elements are");
        for (int i = 0; i < n + 1; i++) {
            System.out.println(b[i]);
        }

    }

}
