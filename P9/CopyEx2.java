package P9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyEx2 {

    public static void main(String[] args) {
        try (FileInputStream iStream = new FileInputStream("D:\\Java-Emblem.jpg");
             FileOutputStream oStream = new FileOutputStream("Java-Emblem.jpg")) {
            int i;
            while ((i = iStream.read()) != -1) {
                oStream.write(i);
            }
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
