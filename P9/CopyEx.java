package P9;

import java.io.*;

public class CopyEx {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(
                new FileReader("D:\\Java-Emblem.jpg"));
             BufferedWriter writer = new BufferedWriter(
                     new FileWriter("Java-Emblem.jpg"));
        ) {
//            int character;
//            while ((character = reader.read()) != -1) {
//                writer.write(character);
//            }

//            String line;
//            while ((line = reader.readLine()) != null) {
//                writer.write(line);
//                writer.write('\n');
//            }
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
