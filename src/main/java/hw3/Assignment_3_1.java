package hw3;
import java.util.Scanner;

public class Assignment_3_1 {
    private static final String MENU =
            "МЕНЮ\n" +
                    "A. СТРОКА ЗАГЛАВНЫМИ БУКВАМИ\n" +
                    "B. строка в нижнем регистре\n" +
                    "C. С Заглавной Буквы (Первый Символ Каждого Слова В Строке)\n" +
                    "D. пЕРВЫЙ сИМВОЛ в нИЖНЕМ рЕГИСТРЕ\n" +
                    "E. Как в предложении(с заглавной буквы)\n" +
                    "F. выход из программы\n ";
    public static final String pattern = "[a-fA-F]";
    public static final String errorMessage = "Данный символ не соответсвует ни одному из пунктов меню.\n" + "Cделайте выбор еще раз:  ";

    public static void getErrorMessage() {
        System.out.println(errorMessage);
    }

    public static void getMenu() {
        System.out.println(MENU);
        System.out.println("Выберите действие и введите букву соответствующего пункта меню:  ");
    }

    public static String turnStringToUpperCase(String input) {
        return input.toUpperCase();
    }

    public static String turnStringToLowerCase(String input) {
        return input.toLowerCase();
    }

    public static String turnFirstLetterToUpperCase(String input) {
        String firstLetter = input.substring(0, 1).toUpperCase();
        String newString = firstLetter + input.substring(1);
        return newString;
    }

    public static String turnAllFirstLettersToUpperCase(String input) {
        String newString = "";
        newString = newString + input.substring(0, 1).toUpperCase();
        for (int i = 1; i < input.length(); i++) {
            if (" ".equals(input.substring(i - 1, i)))
                newString = newString + input.substring(i, i + 1).toUpperCase();
            else
                newString = newString + input.substring(i, i + 1);
        }
        return newString;
    }

    public static String turnAllFirstLettersToLowerCase(String input) {
        String upperCaseString = input.toUpperCase();
        String newString = "";
        newString = newString + upperCaseString.substring(0, 1).toLowerCase();
        for (int i = 1; i < upperCaseString.length(); i++) {
            if (" ".equals(upperCaseString.substring(i - 1, i)))
                newString = newString + upperCaseString.substring(i, i + 1).toLowerCase();
            else
                newString = newString + upperCaseString.substring(i, i + 1);
        }
        return newString;
    }

    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        char inputLetter;
        getMenu();
        while (true) {
            if (sc.hasNext(pattern)) {
                inputLetter = sc.nextLine().charAt(0);
                break;
            } else {
                getErrorMessage();
                getMenu();
                sc.next();
            }
        }
        switch (inputLetter) {
            case 'A':
            case 'a':
                System.out.println(turnStringToUpperCase(inputString));
                break;
            case 'B':
            case 'b':
                System.out.println(turnStringToLowerCase(inputString));
                break;
            case 'C':
            case 'c':
                System.out.println(turnAllFirstLettersToUpperCase(inputString));
                break;
            case 'D':
            case 'd':
                System.out.println(turnAllFirstLettersToLowerCase(inputString));
                break;
            case 'E':
            case 'e':
                System.out.println(turnFirstLetterToUpperCase(inputString));
                break;
            case 'F':
            case 'f':
                return;
        }
    }
}
