package P4;

import java.util.LinkedList;

public class LinkedListEx {

    public static void main(String[] args) {
        Student2 st1 = new Student2("Ivan", 3);
        Student2 st2 = new Student2("Nikolay", 2);
        Student2 st3 = new Student2("Elena", 1);
        Student2 st4 = new Student2("Petr", 4);
        Student2 st5 = new Student2("Mariya", 3);
        LinkedList<Student2> s2LL = new LinkedList<>();
        s2LL.add(st1);
        s2LL.add(st2);
        s2LL.add(st3);
        s2LL.add(st4);
        s2LL.add(st5);
        System.out.println("LinkedList = " + s2LL);
        System.out.println(s2LL.get(2));
        Student2 st6 = new Student2("Zaur", 3);
        Student2 st7 = new Student2("Igor", 4);
        s2LL.add(st6);
        System.out.println("LinkedList = " + s2LL);
        s2LL.add(1, st7);
        System.out.println("LinkedList = " + s2LL);
        s2LL.remove(3);
        System.out.println("LinkedList = " + s2LL);
    }

}

class Student2 {

    String name;
    int course;

    public Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

}