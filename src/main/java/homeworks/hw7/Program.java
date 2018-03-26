package homeworks.hw7;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;


public class Program {
    public static void main(String[] args) {
     // Grep gr = new Grep();
     // gr.grep(Pattern.compile("find me"),"file.txt");
        if(args.length == 2)
        {
            System.out.println("Find word: " +
                    args[0] + " in file: " + args[1]);

            try
            {
                LineNumberReader reader =
                        new LineNumberReader(
                                new BufferedReader(
                                        new FileReader(args[1])));

                String s;
                while(true)
                {
                    s = reader.readLine();
                    if(s == null)
                        break;

                    if(s.indexOf(args[0]) != -1)
                    {
                        System.out.println("<<< " +
                                reader.getLineNumber() + " >>>" + s);
                    }
                }
                reader.close();
            }
            catch (IOException ex)
            {
                System.out.println(ex.toString());
                System.exit(0);
            }
        }
        else
            System.out.println("Args: word file");
    }
}


