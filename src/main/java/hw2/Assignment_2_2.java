package hw2;

import java.util.Scanner;

public class Assignment_2_2 {
    private static final long NUM = 10;

    public static void getMinAndMaxDigitsInNumber(long inputNumber) {
        long minDigit;
        long maxDigit;
        maxDigit = minDigit = inputNumber % NUM;
        while (inputNumber > 0) {
            long currentDigit = inputNumber % NUM;
            if (currentDigit > maxDigit) {
                maxDigit = currentDigit;
            }
            if (currentDigit < minDigit)
                minDigit = currentDigit;
            inputNumber /= NUM;
        }
        System.out.println("Min digit in number = " + minDigit);
        System.out.println("Max digit in number = " + maxDigit);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long inputNumber;
        do {
            System.out.println("Enter positive and non-fractional number: ");
            while (!sc.hasNextLong()) {
                System.out.println("Incorrect input. Please, try again!");
                sc.next();
            }
            inputNumber = sc.nextLong();
            if (inputNumber > 0) {
                getMinAndMaxDigitsInNumber(inputNumber);
            }
        }
        while (inputNumber <= 0);
    }
}

