package com.learning.Arrays;

import java.util.Scanner;

public class TwoDArray
{
    public static void main(String[] args) {
        int n,m;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of Rows");
        n = sc.nextInt();
        System.out.println("Enter Number Of Columns");
        m = sc.nextInt();
        int[][] a = new int[n][m];

        System.out.println("Enter Rows And Columns");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
               a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Output in the Matrix Form");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}
