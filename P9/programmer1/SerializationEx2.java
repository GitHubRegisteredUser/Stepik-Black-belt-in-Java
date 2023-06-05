package P9.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx2 {

    public static void main(String[] args) {
        Car car = new Car("Toyota Camry", "White");
        Employee employee = new Employee("Mariya", "Ivanova", "IT", /*28, */500, car);
        try (ObjectOutputStream oStream = new ObjectOutputStream(
                new FileOutputStream("employees2.bin"))) {
            oStream.writeObject(employee);
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
