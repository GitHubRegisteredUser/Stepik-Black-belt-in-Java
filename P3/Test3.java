package P3;

import java.util.List;
import java.util.ArrayList;

public class Test3 {

    public static void main(String[] args) {
//        List<Number> list = new ArrayList<Integer>();
        List<?> list = new ArrayList<String>();
//        list.add("hello");
        List<? extends Number> list0 = new ArrayList<Integer>();
        List<? super Number> list00 = new ArrayList<Object>();

        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.13);
        list1.add(3.15);
        showListInfo(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("Ok");
        list2.add("Hi");
        list2.add("Bye");
        showListInfo(list2);

        ArrayList<Double> ald = new ArrayList<>();
        ald.add(3.14);
        ald.add(3.13);
        ald.add(3.15);
        System.out.println(sum(ald));

        ArrayList<Integer> ali = new ArrayList<>();
        ali.add(3);
        ali.add(33);
        ali.add(333);
        System.out.println(sum(ali));

//        ArrayList<String> als = new ArrayList<>();
//        System.out.println(sum(als));
    }

    static void showListInfo(List<?> list) {
        System.out.println("My list contains the following elements: " + list);
    }

    public static double sum(ArrayList<? extends Number> al) {
        double sum = 0;
        for (Number n : al) {
            sum += n.doubleValue();
        }
        return sum;
    }

}
