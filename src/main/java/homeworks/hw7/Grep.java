package homeworks.hw7;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Grep {

    private final String filePath;
    private final String phraseToFind;

    public Grep(String filePath, String phraseToFind) {
        this.filePath = filePath;
        this.phraseToFind = phraseToFind;
    }

    public void grep() throws IOException {
        String s;
        Matcher matcher;
        Pattern pattern = null;
        boolean isRegExpr;
        try (LineNumberReader reader = new LineNumberReader
                (Files.newBufferedReader
                        (Paths.get(filePath).toAbsolutePath()))) {
            try {
                pattern = Pattern.compile(phraseToFind);
                isRegExpr = true;
            } catch (PatternSyntaxException e) {
                isRegExpr = false;
            }
            while ((s = reader.readLine()) != null) {
                if (isRegExpr) {
                    matcher = pattern.matcher(s);
                    if (matcher.find()) {
                        System.out.println("*" +
                                reader.getLineNumber() + "* " + s);
                    }
                } else {
                    if (s.contains(phraseToFind)) {
                        System.out.println("*" +
                                reader.getLineNumber() + "* " + s);
                    }
                }
            }
        }
    }
}

