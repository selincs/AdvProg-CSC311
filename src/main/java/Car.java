public class Car extends Vehicle {
    public String brand;

    //Pass existing vehicle to create Car
    public Car(Vehicle v, String brand) {
        super(v.getNumberOfWheels(), v.getColor(), v.getEngineSize(), v.getFuelType());
        this.brand = brand;
    }

    //No preexisting vehicle created yet but known Brand
//    public Car(String brand) {
//        this.brand = brand;
//    }
//
//    //If User sets car values later/no preexisting vehicle or brand
//    public Car() {
//
//    }

    //Get + Set Brand
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    //Honk honk and return
    public void honk() {
        System.out.println("Honk honk!");
    }

    //Display info of car
    public void displayInfo() {
        System.out.println();
        System.out.println("Color : " + getColor());
        System.out.println("Number of Wheels : " + getNumberOfWheels());
        System.out.println("Engine Size : " + getEngineSize());
        System.out.println("Fuel Type : " + getFuelType());
        System.out.println("Car Brand : " + getBrand());
    }

}
