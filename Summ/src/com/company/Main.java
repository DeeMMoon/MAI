package com.company;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        int a, b;
        Collection<Integer> A = new ArrayList<>();
        Collection<Integer> B = new ArrayList<>();
        addElement(A);
        addElement(B);
        //operations(A,B);
        allOperations(A,B);
    }
    public static void allOperations(Collection A, Collection B) {
        intersection(A, B);
        union(A, B);
        symmetricDifferenc(A, B);
        subtract(A, B);
    }
    public static void operations(Collection A, Collection B) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose operations: " + "/n" + "1.Intersection" +
                "/n" + "2.Union" + "/n" + "3.SymmetricDifference" + "4.Subtract");
        int oper = scanner.nextInt();
        switch (oper) {
            case 1:
                intersection(A, B);
                break;
            case 2:
                union(A, B);
                break;
            case 3:
                symmetricDifferenc(A, B);
                break;
            case 4:
                subtract(A, B);
                break;
            default:
                System.out.println("undefinded element");
                ;
                break;
        }
    }
//Первая структура не должна быть больше второй
    public static void addElement(Collection list1) {
        int ink;
        int i=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elements?");
        ink=scanner.nextInt();
        while (i<ink) {
            System.out.println("Input ellement");
            list1.add(scanner.nextInt());
            i++;
        }
    }

    public static void intersection(Collection A, Collection B) {
        Collection set = new HashSet(A);
        Collection set1 = new HashSet(A);
        set.removeAll(B);
        set1.removeAll(set);
        for (Object i:set1) {
            System.out.print(i);
            }
        System.out.println("");        }

    public static void union(Collection A, Collection B) {
        Collection C = new ArrayList(A);
        C.addAll(B);
        for (Object i:C) {
            System.out.print(i);
        }
        System.out.println("");    }

    public static void symmetricDifferenc(Collection A, Collection B) {
        Collection C = new ArrayList(A);
        C.addAll(B);
        Collection set = new HashSet(A);
        Collection set1 = new HashSet(A);
        set.removeAll(B);
        set1.removeAll(set);
        C.removeAll(set1);
        for (Object i:C) {
            System.out.print(i);
        }
        System.out.println("");
    }

    public static void subtract(Collection A, Collection B) {
        Collection C = new ArrayList(A);
        C.removeAll(B);
        for (Object i:C) {
            System.out.print(i);
        }
        System.out.println("");    }

}