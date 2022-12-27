package zg.builderpattern.a.example;

public class Client {
    public static void main(String[] args) {
        CarBuilder carBuilder = new CarBuilder();
        carBuilder.setId(1);
        carBuilder.setNoOfWheels(4);
        Car car = new Car(carBuilder);
        System.out.println(car);
    }
}
