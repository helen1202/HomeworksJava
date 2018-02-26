package homeworks.hw2;

import java.util.Scanner;

public class Assignment_2_1 {

    private static final String COURSE = "Course: Java Core";
    private static final String STUDENT = "Student";
    private static final int BORDER_SIZE = 4;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your full name:");
        String input = sc.nextLine();
        String[] massWithAllStrings = new String[]{COURSE, STUDENT, input};
        alignStringsAndPrint(massWithAllStrings);
    }

    public static int calculateMaxStrLength(String[] massWithAllStrings) {
        int maxLength = 0;
        for (String string : massWithAllStrings)
            if (string.length() > maxLength) {
                maxLength = string.length();
            }
        return maxLength;
    }

    public static void alignStringsAndPrint(String[] massWithAllStrings) {
        final int maxLength = calculateMaxStrLength(massWithAllStrings);
        print(maxLength + BORDER_SIZE);
        for (int i = 0; i < massWithAllStrings.length; i++) {
            print(alignString(massWithAllStrings[i], maxLength));
        }
        print(maxLength + BORDER_SIZE);
    }

    public static String alignString(String inputString, int maxLength) {
        int stringDelta = maxLength - inputString.length();
        if (stringDelta == 0)
            return inputString;

        return addSpaces(inputString, stringDelta);
    }

    public static String addSpaces(String string, int count) {
        StringBuilder sb = new StringBuilder();

        int left = count / 2;
        final char[] leftSpaces = getSpaces(left);
        final char[] rightSpaces = getSpaces(count - left);
        return sb.append(leftSpaces)
                .append(string)
                .append(rightSpaces).toString();
    }

    public static char[] getSpaces(int count) {
        char[] spaces = new char[count];
        for (int i = 0; i < count; i++) {
            spaces[i] = ' ';
        }
        return spaces;
    }

    public static void print(int maxLength) {
        for (int i = 0; i < maxLength; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void print(String s) {
        System.out.println("* " + s + " *");
    }
}

