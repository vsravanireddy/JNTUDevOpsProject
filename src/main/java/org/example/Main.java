package org.example;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("This is my project for JNTU Cloud & DevOps certification program !");
        System.out.println("Add two integers test...");
        System.out.println("..................");
        testAddIntegers();
        System.out.println("Check if number is even test...");
        System.out.println("..................");
        System.out.println("The given number is even :" + checkIfEven(12));
        System.out.println("Print fibonacci numbers until 100 test...");
        System.out.println("..................");
        listFibonacci(100);
        System.out.println("Sorting the given list in ascending order test...");
        System.out.println("..................");
        testSorting(new int [] {89, 43, 15, 1, 12, 22, 67, 32, 56});
        System.out.println("Counting the number of characters in given string test...");
        System.out.println("..................");
        testStringCount("This is a test added in main class to be executed with java application");
        System.out.println("........test");

    }

    public static void testAddIntegers()
    {
        int Number1 = 10;
        int Number2 = 20;
        int sum = Number1 + Number2;
        System.out.println("Output of adding two integers test is: " +  Number1 + " + " + Number2 + " = "  + sum);
    }
    public static boolean checkIfEven (int number){
        return number % 2 == 0;
    }
    public static void listFibonacci(int n) {
        int t1 = 0, t2 = 1;
        System.out.print("Fibonacci numbers upto " + n + ": ");
        while (t1 <= n) {
            System.out.print(t1 + " , ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
    public static void testSorting(int [] arrayToSort) {
        Arrays.sort(arrayToSort);
        System.out.println("Elements of array sorted in ascending order: ");

        for (int i = 0; i < arrayToSort.length; i++)
        {
            System.out.println(arrayToSort[i]);
        }
    }
    public static void testStringCount(String str) {
        System.out.println("Given String: " + str);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                count++;
            }
        }

        System.out.println("Number of characters in given String : " + count);
    }
}