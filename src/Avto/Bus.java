package Avto;

public class Bus extends Transport {
    public Bus(String brand, String model, int yearMade, String country, String color, int maxSpeed, String refill) {
        super(brand, model, yearMade, country, color, maxSpeed, refill);
    }

    public void refil() {
        System.out.println(getRefill());
    }
}
