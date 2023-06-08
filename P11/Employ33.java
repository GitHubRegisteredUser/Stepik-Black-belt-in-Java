package P11;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@MyAnnotation
public class Employ33 {

    String name;
    double salary;

    public Employ33(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @MyAnnotation
    public void increaseSalary() {
        salary *= 2;
    }

    @Override
    public String toString() {
        return "Employ33{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

}

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {

}