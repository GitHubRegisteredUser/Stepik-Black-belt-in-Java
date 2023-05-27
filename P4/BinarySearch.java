package P4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {

    public static void main(String[] args) {
        ArrayList<Integer> aL = new ArrayList<>();
        aL.add(-3);
        aL.add(8);
        aL.add(12);
        aL.add(-8);
        aL.add(0);
        aL.add(5);
        aL.add(10);
        aL.add(1);
        aL.add(150);
        aL.add(-30);
        aL.add(19);
        Collections.sort(aL);
        System.out.println(aL);
        Collections.reverse(aL);
        System.out.println(aL);
        Collections.shuffle(aL);
        System.out.println(aL);
//        int index1 = Collections.binarySearch(aL, 12);
//        System.out.println(index1);

//        Employee emp1 = new Employee(100, "Zaur", 10000);
//        Employee emp2 = new Employee(36, "Ivan", 8888);
//        Employee emp3 = new Employee(11, "Petr", 5555);
//        Employee emp4 = new Employee(5, "Mariya", 1357);
//        Employee emp5 = new Employee(11, "Nikolay", 4321);
//        Employee emp6 = new Employee(97, "Svetlana", 2468);
//        Employee emp7 = new Employee(50, "Elena", 1234);
//        List<Employee> eList = new ArrayList<>();
//        eList.add(emp1);
//        eList.add(emp2);
//        eList.add(emp3);
//        eList.add(emp4);
//        eList.add(emp5);
//        eList.add(emp6);
//        eList.add(emp7);
//        System.out.println(eList);
//        Collections.sort(eList);
//        System.out.println(eList);
//        int index2 = Collections.binarySearch(eList,
//                new Employee(11, "Nikolay", 4321));
//        System.out.println(index2);

//        int[] array = {-3, 8, 12, -8, 0, 5, 10, 1, 150, -30, 19};
//        System.out.println(Arrays.toString(array));
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//        int index3 = Arrays.binarySearch(array, 150);
//        System.out.println(index3);
    }

}

class Employee implements Comparable<Employee> {

    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee other) {
        int res = this.id - other.id;
        if (res == 0) {
            res = this.name.compareTo(other.name);
        }
        return res;
    }

}
