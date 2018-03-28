package homeworks.hw7;

import java.io.IOException;
import java.nio.file.AccessDeniedException;



public class Program {
    public static void main(String[] args) {

        String filePath;
        String stringToFind;
        if(args.length == 2)
        {
           filePath = args[1];
           stringToFind = args[0];

            System.out.println("Find word: " +
                    args[0] + " in file: " + args[1]);

            try
            {
               Grep grep = new Grep();
               grep.grep(stringToFind,filePath);

            }
            catch (AccessDeniedException e)
            {
                System.out.println(e.toString());
                System.exit(0);
            }
            catch (IOException ex)
            {
                System.out.println(ex.toString());
                System.exit(0);
            }
        }
        else
            System.out.println("Incorrect input!\n First argument must be word to find and second one - file path.");
    }
}


