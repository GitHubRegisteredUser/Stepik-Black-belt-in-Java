package P6;

import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.Consumer;

public class Test3 {

    public static ArrayList<Car> create3Cars(Supplier<Car> carSupplier) {
        ArrayList<Car> al = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            al.add(carSupplier.get());
        }
        return al;
    }

    public static void changeCar(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);
    }

    public static void main(String[] args) {
        ArrayList<Car> cars = create3Cars(() -> new Car("Toyota Camry", "Black", 3.5));
        System.out.println("Cars: " + cars);

        changeCar(cars.get(0),
                car -> {
                    car.colour = "white";
                    System.out.println("changed car: " + car);
                });
        System.out.println("Cars: " + cars);
    }

}

class Car {

    String model;
    String colour;
    double engine;

    public Car(String model, String colour, double engine) {
        this.model = model;
        this.colour = colour;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", engine=" + engine +
                '}';
    }

}
