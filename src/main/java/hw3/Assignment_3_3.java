package hw3;

import java.util.Scanner;

public class Assignment_3_3 {

    public static final String patternForFio = "^[a-zA-Z\\s+\\-+]+$";
    public static final String patternForPhoneNumber = "^\\+380\\d{9}$";
    public static final String patternForEmail = "^([a-zA-Z0-9_\\-\\.]+)" +
            "@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]" +
            "+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$";
    public static final String errorMessage = "Данные невалидны.";
    public static final String validMessage = "Данные корректны.";

    public static boolean containsPatternFio(String s, String pattern) {
        boolean matchesPatternForString = s.matches(pattern);
        if (matchesPatternForString) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println("Введите ФИО:");
        Scanner sc = new Scanner(System.in);
        if (sc.nextLine().matches(patternForFio)) {
            System.out.println(validMessage);
        } else {
            System.out.println(errorMessage);
        }
    }
}
