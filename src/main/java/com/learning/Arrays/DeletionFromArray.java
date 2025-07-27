package com.learning.Arrays;

import java.util.Scanner;

public class DeletionFromArray {
    public static void main(String[] args) {
        int n,m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n-1];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter index for element deletion");
        m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (i<m){
                b[i] = a[i];
            }
            else if (i == m){
                continue;
            }
            else {
             b[i-1] = a[i];
            }
        }

        System.out.println("Final Array :");
        for (int i = 0; i < n-1; i++) {
            System.out.println(b[i]);
        }

    }
}
