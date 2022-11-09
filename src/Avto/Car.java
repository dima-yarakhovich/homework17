package Avto;

public class Car extends Transport {
    private double engineVolume;
    private String transmission;
    private String type;
    private String number;
    private int seats;
    private String tires;


    public Car(String brand, String model, int yearMade, String country, String color, double engineVolume, String transmission, String type, String number, int seats, String tires, int maxSpeed, String refill) {
        super(brand, model, yearMade, country, color, maxSpeed, refill);
        this.engineVolume = engineVolume;
        this.transmission = transmission;
        this.type = type;
        this.number = number;
        this.seats = seats;
        this.tires = tires;
    }

    public void refil() {
        System.out.println(getRefill());
    }

    public double getEngineVolume() {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }


    public String getTransmission() {
        if (transmission.isEmpty() || transmission == null || transmission.isBlank()) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
        return transmission;
    }

    public void setType(String type) {
        if (type.isEmpty() || type == null || type.isBlank()) {
            this.type = "default";
        } else {
            this.type = type;
        }
    }

    public String getType() {
        if (type.isEmpty() || type == null || type.isBlank()) {
            this.type = "default";
        } else {
            this.type = type;
        }
        return type;
    }

    public String getNumber() {
        if (number.isEmpty() || number == null || number.isBlank()) {
            this.number = "default";
        } else {
            this.number = number;
        }
        return number;
    }

    public void setNumber(String number) {
        if (number.isEmpty() || number == null || number.isBlank()) {
            this.number = "default";
        } else {
            this.number = number;
        }
    }

    public int getSeats() {
        if (seats <= 0) {
            this.seats = 5;
        } else {
            this.seats = seats;
        }
        return seats;
    }

    public String getTires() {
        if (tires.isEmpty() || tires == null || tires.isBlank()) {
            this.tires = "default";
        } else {
            this.tires = tires;
        }
        return tires;
    }

    public void setTires(String tires) {
        if (tires.isEmpty() || tires == null || tires.isBlank()) {
            this.tires = "default";
        } else {
            this.tires = tires;
        }
    }

    public String toString() {
        return getBrand() + " " + getModel() + ", " + getYearMade() + " года выпуска, сборка в: " + getCountry() + ", " + getColor() + " цвет кузова, объём: - " + engineVolume + " л."
                + ", Коробка передач: " + transmission + ", Тип кузова: " + type + ", Регистрационный номер: " + number + ", Количество мест: " + seats + ", Тип резины: " + tires;
    }

}