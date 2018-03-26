package homeworks.hw7;

import java.io.*;
import java.util.regex.Pattern;

public class Grep {

    public void grep(Pattern inputPattern, String fileName) {
        try (FileReader fileReader = new FileReader(fileName);
             LineNumberReader lineNumberReader = new LineNumberReader(fileReader)){
            while(lineNumberReader.readLine()!=null){

            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    }

