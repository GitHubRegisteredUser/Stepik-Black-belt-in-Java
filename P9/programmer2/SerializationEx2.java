package P9.programmer2;

import P9.programmer1.Employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationEx2 {

    public static void main(String[] args) {
        Employee bestEmployee;
        try (ObjectInputStream iStream = new ObjectInputStream(
                new FileInputStream("employees2.bin"))) {
            bestEmployee = (Employee) iStream.readObject();
            System.out.println(bestEmployee);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
