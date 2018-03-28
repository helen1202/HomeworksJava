package homeworks.hw7;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Grep {

    public void grep(String phraseToFind, String filePath) throws IOException {
        try (LineNumberReader reader = new LineNumberReader
                (Files.newBufferedReader
                        (Paths.get(filePath).toAbsolutePath()))) {

            String s;
            while ((s = reader.readLine()) != null) {
                if (s.contains(phraseToFind)) {
                    System.out.println("*" +
                            reader.getLineNumber() + "* " + s);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

