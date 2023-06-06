package P9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PathAndFilesEx3 {

    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test10.txt");
//        Files.createFile(filePath);
//        String d = "-Hi\n-Hi\n-How are you?\n-I am fine, and how are you?\n-I am fine too";
//        Files.write(filePath, d.getBytes());

        List<String> list = Files.readAllLines(filePath);
        for (String s : list) {
            System.out.println(s);
        }
    }

}
