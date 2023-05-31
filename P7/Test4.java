package P7;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test4 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(4);
        list.add(2);

        int result = list.stream().reduce((accumulator, element) ->
                accumulator * element).get();

        int result2 = list.stream().reduce(1, (accumulator, element) ->
                accumulator * element);

//        Optional<Integer> o = list.stream().reduce((accumulator, element) ->
//                accumulator * element);
//        if (o.isPresent()) {
//            System.out.println(o.get());
//        } else {
//            System.out.println("Not present");
//        }

        List<String> list3 = new ArrayList<>();
        list3.add("Hi");
        list3.add("How are you");
        list3.add("Fine");
        list3.add("Bye");

        String result3 = list3.stream().reduce((a, e) ->
                a + " " + e).get();
        System.out.println(result3);
    }

}
