import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Car implements Comparable<Car> {
    private String modelName;
    private int productionYear;

    public Car(String modelName, int productionYear) {
        this.modelName = modelName;
        this.productionYear = productionYear;
    }

    public String getModelName() {
        return modelName;
    }

    public int getProductionYear() {
        return productionYear;
    }

    @Override
    public int compareTo(Car other) {
        return Integer.compare(this.productionYear, other.productionYear);
    }

    @Override
    public String toString() {
        return modelName + " - " + productionYear;
    }

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Toyota Camry", 2010));
        cars.add(new Car("Honda Accord", 2015));
        cars.add(new Car("Ford Mustang", 2012));
        cars.add(new Car("Chevrolet Malibu", 2018));
        cars.add(new Car("BMW 3 Series", 2013));
        cars.add(new Car("Audi A4", 2014));
        cars.add(new Car("Mercedes-Benz C-Class", 2011));
        cars.add(new Car("Lexus ES", 2016));
        cars.add(new Car("Hyundai Sonata", 2017));
        cars.add(new Car("Volkswagen Passat", 2019));

        Collections.sort(cars);

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
