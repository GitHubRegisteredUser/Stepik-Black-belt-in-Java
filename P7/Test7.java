package P7;

import java.util.ArrayList;
import java.util.List;

public class Test7 {

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 2, 6.5);
        Student st2 = new Student("Petr", 'm', 24, 3, 8.4);
        Student st3 = new Student("Mariya", 'f', 25, 3, 7.9);
        Student st4 = new Student("Vasiliy", 'm', 28, 4, 7.5);
        Student st5 = new Student("Anna", 'f', 20, 1, 9.1);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Applied Mathematics");
        f1.addStToF(st1);
        f1.addStToF(st2);
        f1.addStToF(st3);
        f2.addStToF(st4);
        f2.addStToF(st5);

        List<Faculty> fL = new ArrayList<>();
        fL.add(f1);
        fL.add(f2);

        fL.stream().flatMap(faculty ->
                        faculty.getStOnF().stream()).
                forEach(e -> System.out.println(e.getName()));
    }

}

class Faculty {

    String name;
    List<Student> stOnF;

    public Faculty(String name) {
        this.name = name;
        stOnF = new ArrayList<>();
    }

    public List<Student> getStOnF() {
        return stOnF;
    }

    public void addStToF(Student st) {
        stOnF.add(st);
    }

}