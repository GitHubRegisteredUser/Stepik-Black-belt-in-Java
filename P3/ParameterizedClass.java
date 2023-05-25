package P3;

public class ParameterizedClass {

    public static void main(String[] args) {
//        Info<String> info1 = new Info<>("Hello");
//        System.out.println(info1);
//        String s = info1.getValue();

//        Info<Integer> info2 = new Info<>(25);
//        System.out.println(info2);
//        Integer i = info2.getValue();
//
//        Info<Double> info21 = new Info<>(3.14);
//        System.out.println(info21);
//        Double d = info21.getValue();

//        Info<Bus> info3 = new Info<>(new Bus());
//        System.out.println(info3);
//        Bus b = info3.getValue();
    }

//    public void abc(Info<String> info) {
//        String s = info.getValue();
//    }
//
//    public void abc(Info<Integer> info) {
//        Integer i = info.getValue();
//    }
//    abc(Info info)

}


class Info<T extends Number&I1&I2> {

    private T value;

    public Info(T value) {
        this.value = value;
    }

    public String toString() {
        return "{[" + value + "]}";
    }

    public T getValue() {
        return value;
    }

}

interface I1 {

}

interface I2 {

}

//class Super {
//
//    public void abc(Info<String> info) {
//        String s = info.getValue();
//    }
//
//}
//
//class Sub extends Super {
//
//    public void abc(Info<Integer> info) {
//        Integer i = info.getValue();
//    }
//
//}

class Bus {

}