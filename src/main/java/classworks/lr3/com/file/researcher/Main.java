package classworks.lr3.com.file.researcher;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        FilePhraseSearcher filePhraseSearcher = new FilePhraseSearcher("main",System.out);
        Files.walkFileTree(Paths.get("C:\\Users\\ekuznetsova\\IdeaProjects\\homeworksJava\\src\\main\\java\\classworks"),filePhraseSearcher);
    }
}
