package P11;

import java.lang.annotation.*;

public class Test2 {

    public static void main(String[] args) throws ClassNotFoundException {
        Class xiaomiCLass = Class.forName("P11.Xiaomi");
        Annotation annotation1 = xiaomiCLass.getAnnotation(SmartPhone.class);
        SmartPhone smph1 = (SmartPhone) annotation1;
        System.out.println("Annotation info from Xiaomi class: " +
                smph1.OS() + ", " + smph1.yearOfCC());

        Class iPhoneCLass = Class.forName("P11.iPhone");
        Annotation annotation2 = iPhoneCLass.getAnnotation(SmartPhone.class);
        SmartPhone smph2 = (SmartPhone) annotation2;
        System.out.println("Annotation info from iPhone class: " +
                smph2.OS() + ", " + smph2.yearOfCC());
    }

}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone {

    String OS() default "Android";

    int yearOfCC() default 2010;

}

@SmartPhone
class Xiaomi {

    String model;
    double price;

}

@SmartPhone(OS = "IOS", yearOfCC = 1976)
class iPhone {

    String model;
    double price;

}