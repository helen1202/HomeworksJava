package homeworks.hw3;

import java.util.Scanner;

public class Assignment_3_2 {
    private static int[] countedResult = new int[256];
    public static final String pattern = "^[a-zA-Z\\s+]+$";
    public static final String errorMessage = "Некорректный ввод данных.\n" + "Введите строку из латинских букв еще раз: ";

    public static boolean containsLatinAlphabet(String s) {
        boolean matchesPatternForString = s.matches(pattern);
        if (matchesPatternForString) {
            return true;
        } else {
            return false;
        }
    }

    public static void getErrorMessage() {
        System.out.println(errorMessage);
    }

    public static void main(String[] args) {
        System.out.println("Введите строку из букв латинского алфавита: ");
        Scanner sc = new Scanner(System.in);
        char[] massOfCharsInput;
        while (true) {
            String currentInput = sc.nextLine();
            if (containsLatinAlphabet(currentInput)) {
                massOfCharsInput = currentInput.toCharArray();
                break;
            } else {
                getErrorMessage();
            }
        }

        for (int i = 0; i < massOfCharsInput.length; i++) {
            countedResult[massOfCharsInput[i]]++;
        }
        for (int i = 0; i < countedResult.length; i++) {
            if (countedResult[i] > 0) {
                if ((char) (i) != ' ') {
                    System.out.println("Буква " + (char) i +
                            " встречается в строке " + countedResult[i] + " раз.");
                }
            }
        }
    }
}