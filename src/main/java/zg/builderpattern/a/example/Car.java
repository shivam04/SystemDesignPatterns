package zg.builderpattern.a.example;

public class Car {
    Integer id;
    Integer noOfWheels;
    Integer noOfDoors;
    String engine;
    boolean isAutomatic;
    boolean bluetooth;
    String type;
    String color;
    int cost;
    String manufacture;
    Integer buildOfYear;

    public Car(CarBuilder carBuilder) {
        this.id = carBuilder.id;
        this.noOfDoors = carBuilder.noOfDoors;
        this.noOfWheels = carBuilder.noOfWheels;
        if (carBuilder.getId() == null) throw new RuntimeException("id is null");
        if (carBuilder.getNoOfWheels() == null || carBuilder.getNoOfWheels() < 2) throw new RuntimeException("noOfWheels is less than 2");
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", noOfWheels=" + noOfWheels +
                ", noOfDoors=" + noOfDoors +
                ", engine='" + engine + '\'' +
                ", isAutomatic=" + isAutomatic +
                ", bluetooth=" + bluetooth +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", cost=" + cost +
                ", manufacture='" + manufacture + '\'' +
                ", buildOfYear=" + buildOfYear +
                '}';
    }
}
