package P9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class PathAndFilesEx1 {

    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt");
        Path dirPath = Paths.get("D:\\M");
        System.out.println("filePath.getFileName() " + filePath.getFileName());
        System.out.println("dirPath.getFileName() " + dirPath.getFileName());
        System.out.println("------------------------------");
        System.out.println("filePath.getParent() " + filePath.getParent());
        System.out.println("dirPath.getParent() " + dirPath.getParent());
        System.out.println("------------------------------");
        System.out.println("filePath.getRoot() " + filePath.getRoot());
        System.out.println("dirPath.getRoot() " + dirPath.getRoot());
        System.out.println("------------------------------");
        System.out.println("filePath.isAbsolute() " + filePath.isAbsolute());
        System.out.println("dirPath.isAbsolute() " + dirPath.isAbsolute());
        System.out.println("------------------------------");
        System.out.println("filePath.toAbsolutePath() " + filePath.toAbsolutePath());
        System.out.println("dirPath.toAbsolutePath() " + dirPath.toAbsolutePath());
        System.out.println("------------------------------");
        System.out.println("filePath.getParent() " + filePath.toAbsolutePath().getParent());
        System.out.println("filePath.getRoot() " + filePath.toAbsolutePath().getRoot());
        System.out.println("------------------------------");
        System.out.println("dirPath.resolve(filePath) " + dirPath.resolve(filePath));
        System.out.println("------------------------------");
        Path otherPath = Paths.get("D:\\M\\N\\K\\test20.txt");
        System.out.println("dirPath.relativize(otherPath) " + dirPath.relativize(otherPath));
        System.out.println("------------------------------");
        if (!Files.exists(filePath)) {
            Files.createFile(filePath);
        }
        if (!Files.exists(dirPath)) {
            Files.createDirectory(dirPath);
        }
        System.out.println("Files.isReadable(filePath) " + Files.isReadable(filePath));
        System.out.println("Files.isWritable(filePath) " + Files.isWritable(filePath));
        System.out.println("Files.isExecutable(filePath) " + Files.isExecutable(filePath));
        System.out.println("------------------------------");
        Path filePath2 = Paths.get("X:\\XXX\\XXX\\IdeaProjects\\Black belt in Java\\test15.txt");
        System.out.println("Files.isSameFile(filePath, filePath2) " + Files.isSameFile(filePath, filePath2));
        System.out.println("------------------------------");
        System.out.println("Files.size(filePath) " + Files.size(filePath));
        System.out.println("------------------------------");
        Map<String, Object> attributes = Files.readAttributes(filePath, "*");
        for (Map.Entry<String, Object> entry : attributes.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

}
