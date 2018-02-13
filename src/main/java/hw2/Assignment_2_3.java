package hw2;

import java.util.Scanner;

public class Assignment_2_3 {
    public static int calculateFibonacciNumber(int index) {
        if (index == 0) {
            return 0;
        } else if (index == 1) {
            return 1;
        } else
            return calculateFibonacciNumber((index - 1)) + calculateFibonacciNumber(index - 2);
    }

    public static void main(String[] args) {
        System.out.print("Enter index: ");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        System.out.println("Fibonacci number is " + calculateFibonacciNumber(index));
    }
}
