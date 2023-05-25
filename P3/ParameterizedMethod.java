package P3;

import java.util.ArrayList;

public class ParameterizedMethod {

    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(20);
        al1.add(5);
        int a = GenMethod.getSecondElement(al1);
        System.out.println(a);

//        ArrayList<String> al2 = new ArrayList<>();
//        al2.add("qwe");
//        al2.add("asd");
//        al2.add("zxc");
//        String s = GenMethod.getSecondElement(al2);
//        System.out.println(a);
    }

}

class GenMethod {

    public static <T extends Number> T getSecondElement(ArrayList<T> al) {
        return al.get(1);
    }

}
