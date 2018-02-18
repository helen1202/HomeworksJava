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

    public static void checkUsersInput(String s, String pattern) {
        if (s.matches(pattern)) {
            System.out.println(validMessage);
        } else {
            System.out.println(errorMessage);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, type your full name: ");
        checkUsersInput(sc.nextLine(), patternForFio);
        System.out.println("Please, type your phone number: ");
        checkUsersInput(sc.nextLine(),patternForPhoneNumber);
        System.out.println("Please, type your email: ");
        checkUsersInput(sc.nextLine(),patternForEmail);
        }
    }
