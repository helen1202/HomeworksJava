package hw3;

import java.util.Scanner;

public class Assignment_3_3 {

    private static final String patternForFio = "^[a-zA-Z\\s+\\-+]+$";
    private static final String patternForPhoneNumber = "^\\+380\\d{9}$";
    private static final String patternForEmail = "^([a-zA-Z0-9_\\-\\.]+)" +
            "@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]" +
            "+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$";
    private static final String errorMessage = "Incorrect input!";
    private static final String validMessage = "Correct input.";
    private static final String messageForTypeFio = "Please, type your full name: ";
    private static final String messageForTypePhone = "Please, type your phone number: ";
    private static final String messageForTypeEmail = "Please, type your email: ";

    public static void checkUsersInput(String s, String pattern) {
        if (s.matches(pattern)) {
            System.out.println(validMessage);
        } else {
            System.out.println(errorMessage);
        }
    }

    public static void main(String[] args) {
        String[] mas = {patternForFio, patternForPhoneNumber, patternForEmail};
        String[] messages = {messageForTypeFio, messageForTypePhone, messageForTypeEmail};
        System.out.println("Please, type your full name: ");
        System.out.println("Please, type your phone number: ");
        System.out.println("Please, type your email: ");
        Scanner sc = new Scanner(System.in);
        outer:
        for (String str : messages) {
            System.out.println(str);
            inner:
            for (String s : mas) {
                checkUsersInput(sc.nextLine(), s);
                continue outer;
            }
        }
    }
}
