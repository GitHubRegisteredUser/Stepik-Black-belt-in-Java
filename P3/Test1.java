package P3;

import java.util.List;
import java.util.ArrayList;

public class Test1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        list.add("ok");
//        list.add(5);
//        list.add(new StringBuilder("wasd"));
//        list.add(new Car());

        list.add("Hi");
        list.add("Bye");
        list.add("OK");
        list.add("12345");
//        list.add(new Car());

        for (Object o : list) {
            System.out.println(o + " length " + ((String) o).length());
        }
    }

}

class Car {

}