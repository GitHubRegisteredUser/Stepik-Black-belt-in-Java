package P11;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Ex2 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException,
            InvocationTargetException, InstantiationException, IllegalAccessException {
        Class employeeClass = Class.forName("P11.Employee");

//        Constructor<Employee> constructor1 = employeeClass.getConstructor();
//        Employee obj1 = constructor1.newInstance();
//        System.out.println(obj1);

        Constructor constructor2 = employeeClass.getConstructor(int.class, String.class, String.class);
        Object obj2 = constructor2.newInstance(5, "Zaur", "IT");
//        System.out.println(obj2);

        Method method = employeeClass.getMethod("setSalary", double.class);
        method.invoke(obj2, 800.08);
        System.out.println(obj2);
    }

}
