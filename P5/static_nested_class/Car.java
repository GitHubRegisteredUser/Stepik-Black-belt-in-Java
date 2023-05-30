package P5.static_nested_class;

public class Car {

    String color;
    int doorCount;
    Engine engine;
    private static int x;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    void method() {
        System.out.println(Engine.countOfObjects);
        Engine e = new Engine(220);
        System.out.println(e.horsePower);
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public static class Engine {

        int horsePower;
        static int countOfObjects;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
            countOfObjects++;
//            System.out.println(x);
//            System.out.println(doorCount);
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }

    }
}

class Test {

    public static void main(String[] args) {
        Car.Engine e = new Car.Engine(249);
        Car c = new Car("Black", 4, e);
        System.out.println(c);
    }

}

//class X extends Car.Engine {
//
//    X() {
//        super(200);
//    }
//
//}