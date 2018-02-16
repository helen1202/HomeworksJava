package lr;

import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    private static final int MIN_LENGTH = 8;
    private static final int MAX_LENGTH = 20;
    private static final int NUMBER_OF_GROUPS = 3;
    private static final int CHARACTERS_GROUP_ID = 0;
    private static final int DIGITS_GROUP_ID = 1;
    private static final int LETTERS_GROUP_ID = 2;
    private static final String CHARACTERS_GROUP = "!@#&%^&*";
    private static final String DIGITS_GROUP = "0123456789";
    private static final String LETTERS_GROUP = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final Random random;

    public PasswordGenerator() {
        random = new Random();
    }

    public String generatePassword(int length) {
        if (length < MIN_LENGTH || length > MAX_LENGTH) {
            return null;
        }
        StringBuilder password = new StringBuilder();
        boolean charachterNotExist = true;
        int count = 0;
        char nextChar;
        while (password.length() < length) {
            switch (random.nextInt(NUMBER_OF_GROUPS)) {
                case CHARACTERS_GROUP_ID:
                    if (charachterNotExist) {
                        nextChar = getRandomChar(CHARACTERS_GROUP);
                        password.append(nextChar);
                        charachterNotExist = false;
                    }
                    break;
                case DIGITS_GROUP_ID:
                    if (count < 3) {
                        nextChar = getRandomChar(DIGITS_GROUP);
                        if (password.length() == 0 || password.charAt(password.length() - 1) != nextChar) {
                            password.append(nextChar);
                            count++;
                        }
                    }
                    break;
                case LETTERS_GROUP_ID:
                    nextChar = getRandomChar(LETTERS_GROUP);
                    if (password.length()==0 || password.charAt(password.length() - 1) != nextChar) {
                        password.append(nextChar);

                        break;
                    }
            }
        }
        return password.toString();
    }

    private char getRandomChar(String alphabet) {
        int index = random.nextInt(alphabet.length());
        return alphabet.charAt(index);
    }
//while(true)random вызвать и сделать его 1 раз
// case 1, 2, 3

    //case 1
    //random from 1/2/3
    //ветка 1 символы if at least 1, characters (tr/false)
    //add ti string buffer

    //ветка цифр calc numers (if == 3) continue;
    // ветка букв - проверяем не равен ли предыдущий символ текущему
   /* Scanner sc = new Scanner(System.in);

        while(true)

    {
        System.out.println("Please enter password legth (from 8 to 20 characters): ");
        if (sc.hasNextInt()) {
            int passLength = sc.nextInt();
            if ((passLength >= MIN_LENGTH) && (passLength <= MAX_LENGTH)) {
                System.out.println(passLength);
                break;
            }
        } else {
            sc.next();
        }
    }

*/

}


