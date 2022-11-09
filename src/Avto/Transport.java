package Avto;

public abstract class Transport {
    private String brand;
    private String model;
    private int yearMade;
    private String country;
    private String color;
    private int maxSpeed;
    private String refill;


    public Transport(String brand, String model, int yearMade, String country, String color, int maxSpeed, String refill) {
        this.brand = brand;
        this.refill = refill;
        this.model = model;
        this.yearMade = yearMade;
        this.country = country;
        if (color.isEmpty() || color == null || color.isBlank()) {
            this.color = "Не указан";
        } else {
            this.color = color;
            this.maxSpeed = maxSpeed;
        }
    }

    public String getRefill() {
        return refill;
    }

    public abstract void refil();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearMade() {
        return yearMade;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        if (maxSpeed <= 0) {
            maxSpeed = 0;
        } else {
            return maxSpeed;
        }
        return 0;
    }

    public void setColor(String color) {
        if (color.isEmpty() || color == null || color.isBlank()) {
            this.color = "Не указан";
        } else {
            this.color = color;
        }
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0) {
            maxSpeed = 0;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    @Override
    public String toString() {
        return brand + " " + model + ", " + yearMade + " года выпуска, сборка в: " + country + ", " + color + " цвет кузова, Максимальная скорость движения равна: " + maxSpeed;
    }
}
