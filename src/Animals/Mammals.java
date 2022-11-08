package Animals;

public class Mammals extends Animals {
    private String habitat;
    private int speed;

    public Mammals(String name, int years, String habitat, int speed) {
        super(name, years);
        this.habitat = habitat;
        this.speed = speed;
    }

    public String getHabitat() {
        if (habitat.isEmpty() || habitat == null || habitat.isBlank()) {
            this.habitat = "default";
        }
        return habitat;
    }

    public int getSpeed() {
        if (speed <= 0) {
            this.speed = 5;
        }
        return speed;
    }

    public void walk() {
        System.out.println("Гулять");
    }

    @Override
    public String toString() {
        return "Кличка животного: " + getName() + ", Количество лет: " + getYears() + ", Среда проживания: " + getHabitat() + ", Скорость перемещения: " + getSpeed() + super.toString();

    }
}
