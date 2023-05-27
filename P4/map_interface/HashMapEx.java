package P4.map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Zaur Tregulov");
        map1.put(100, "Ivan Petrov");
        map1.put(250, "Mariya Sidorova");
        map1.put(333, "Petr Ivanov");
        map1.putIfAbsent(1000, "Elena Sokolova");
//        map1.put(null, "Sergey Gusev");
//        map1.put(123, null);
        System.out.println(map1);

        System.out.println(map1.get(1000));
        map1.remove(333);
        System.out.println(map1);
        System.out.println(map1.containsKey(333));
        System.out.println(map1.containsValue("Ivan Petrov"));
        System.out.println(map1.keySet());
        System.out.println(map1.values());
    }

}
