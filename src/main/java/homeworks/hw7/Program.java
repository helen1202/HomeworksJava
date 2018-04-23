package homeworks.hw7;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.NoSuchFileException;

public class Program {
    public static void main(String[] args) {

        String filePath = null;
        String stringToFind = null;
        try {
            filePath = args[0];
            stringToFind = args[1];
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Incorrect input!\n First argument must be word to find and second one - file path.");
            System.exit(1);
        }

        System.out.println("Find word " +
                    args[0] + " in file " + args[1]);
            try
            {
               Grep grep = new Grep(stringToFind,filePath);
               grep.grep();
            }
            catch (AccessDeniedException e)
            {
                System.err.println(e.toString());
            }
            catch (NoSuchFileException e){
                System.err.println(e.toString());
            }
            catch (FileNotFoundException e) {
                System.err.println(e.toString());
            }

            catch (IOException e)
            {
                System.err.println(e.toString());
            }
        }
    }



