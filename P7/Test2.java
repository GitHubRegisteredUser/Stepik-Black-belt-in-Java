package P7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 2, 6.5);
        Student st2 = new Student("Petr", 'm', 24, 3, 8.4);
        Student st3 = new Student("Mariya", 'f', 25, 3, 7.9);
        Student st4 = new Student("Vasiliy", 'm', 28, 4, 7.5);
        Student st5 = new Student("Anna", 'f', 20, 1, 9.1);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

//        students.stream().map(element ->
//                {
//                    element.setName(element.getName().toUpperCase());
//                    return element;
//                }).
//                filter(element -> element.getSex() == 'f').
//                sorted((x, y) -> x.getAge() - y.getAge()).
//                forEach(element -> System.out.println(element));

        Student first = students.stream().map(element ->
                {
                    element.setName(element.getName().toUpperCase());
                    return element;
                }).
                filter(element -> element.getSex() == 'f').
                sorted((x, y) -> x.getAge() - y.getAge()).
                findFirst().get();
        System.out.println(first);

//        students = students.stream().sorted((x, y) ->
//                        x.getName().compareTo(y.getName())).
//                collect(Collectors.toList());
//        System.out.println(students);

//        students = students.stream().filter(element ->
//                        element.getAge() > 22 && element.getAvgGrade() > 8.0).
//                collect(Collectors.toList());
//        System.out.println(students);

//        Stream<Student> myStream = Stream.of(st1, st2, st3, st4, st5);
//        myStream.filter(element ->
//                        element.getAge() > 22 && element.getAvgGrade() > 8.0).
//                collect(Collectors.toList());
    }

}

class Student {

    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.setName(name);
        this.setSex(sex);
        this.setAge(age);
        this.setCourse(course);
        this.setAvgGrade(avgGrade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", sex=" + getSex() +
                ", age=" + getAge() +
                ", course=" + getCourse() +
                ", avgGrade=" + getAvgGrade() +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

}