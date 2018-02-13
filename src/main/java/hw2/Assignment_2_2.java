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
        System.out.print("Enter positive and non-fractional number: ");
        Scanner sc = new Scanner(System.in);
        long inputNumber;
        while (true) {
            if (sc.hasNextLong()) {
                //тут ошибки, так как приходится два раза вводить число 
                //происходит потому что подряд идет вызов nextLong()              
                if (sc.nextLong() > 0){
                    inputNumber = sc.nextLong();
                    break;
                }
            }
            else {
                System.out.println("You`ve entered a wrong number!\nPlease try again:");
                sc.next();
            }
        }
        getMinAndMaxDigitsInNumber(inputNumber);
    }
}
