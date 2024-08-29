public class Main {
    public static void main(String[] args) {
       //Create Vehicle + Car, Display, Honk
        Vehicle v1 = new Vehicle(4, "Green", 3.1F, "Diesel");
        Car c1 = new Car(v1, "Chevrolet");
        c1.displayInfo();
        c1.honk();


        //Change Car's values with setters and display again
        c1.setColor("Black");
        c1.setBrand("Ferrari");
        c1.setEngineSize(4.2F);
        c1.setNumberOfWheels(6);
        c1.setFuelType("Regular");
        c1.displayInfo();
        //honk
        c1.honk();
    }

}
