package P6;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIf {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("1");
        al.add("12");
        al.add("123");
        al.add("1234");
        al.add("12345");
//        al.removeIf(element -> element.length() < 4);
//        System.out.println(al);
        Predicate<String> p = element -> element.length() < 4;
        al.removeIf(p);
        System.out.println(al);
    }

}
