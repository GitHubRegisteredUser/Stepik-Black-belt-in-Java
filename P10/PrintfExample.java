package P10;

public class PrintfExample {

    static void empInfo(Employee emp) {
        System.out.printf("%03d \t %-12s \t %-12s \t %,.1f \n",
                emp.id, emp.name, emp.surname, emp.salary * (1 + emp.bonus));
    }

    public static void main(String[] args) {
//        Employee emp1 = new Employee(1, "Zaur", "Tregulov", 12345, 0.15);
//        Employee emp2 = new Employee(5, "Ivan", "Petrov", 6789, 0.1);
//        Employee emp3 = new Employee(10, "Mariya", "Sidorova", 8888, 0.12);
//        empInfo(emp1);
//        empInfo(emp2);
//        empInfo(emp3);

        String newString = String.format("%03d \t %-12s \t %-12s \t %,.1f \n",
                1, "Zaur", "Tregulov", 12345 * (1 + 0.15));
        System.out.println(newString);
    }

}

class Employee {

    int id;
    String name;
    String surname;
    int salary;
    double bonus;

    public Employee(int id, String name, String surname, int salary, double bonus) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.bonus = bonus;
    }

}