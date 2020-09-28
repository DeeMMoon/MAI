package com.company;

import java.util.ArrayList;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
      // MatrsmejToListsmej();
        //ListsmejToMatrsmej();
        MatrsmejToMatrinced();

    }

    static void MatrsmejToListsmej() {
        Scanner con = new Scanner(System.in);
        int n = con.nextInt();
        ArrayList<ArrayList<Integer>> g =
                new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++)
            g.add(new ArrayList<Integer>());
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= n; j++) {
                int val = con.nextInt();
                if (val == 1) g.get(i).add(j);
            }

        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            for (int j = 0; j < g.get(i).size(); j++)
                System.out.print(" " + g.get(i).get(j));
            System.out.println();
        }
        con.close();
    }

    static void ListsmejToMatrsmej() {
        Scanner con = new Scanner(System.in);
        int n = con.nextInt();
        ArrayList<ArrayList<Integer>> g =
                new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n - 1; i++)
            g.add(new ArrayList<Integer>());
        for (int i = 0; i <= n - 1; i++) {
            System.out.println("Input value");
            int k = con.nextInt();
            for (int j = 0; j <= k - 1; j++) {
                int val = con.nextInt();
                g.get(i).add(val);
            }
        }
        int[][] matr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int q = 0; q < g.get(i).size(); q++) {
                    matr[i][j] = 0;
                    if (j == (g.get(i).get(q)-1)){
                        matr[i][j] = 1;
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matr[i][j]);
            }
            System.out.println();

        }
    }
    static void MatrsmejToMatrinced() {
        Scanner con = new Scanner(System.in);
        System.out.println("Введите число вершин");
        int n = con.nextInt();
        System.out.println("Введите число рёбер");
        int m = con.nextInt();
        int k = 2;
        int[][] matrix = new int[m][n];
        int [][] list = new int [m][k];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = con.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) list[i][1] = j;
                else if (matrix[i][j] == -1) list[i][0] = j;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(list[i][j] + " ");
            }
            System.out.println();
        }
    }
}