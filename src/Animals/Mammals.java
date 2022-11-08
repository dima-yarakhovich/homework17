package Animals;

public class Mammals extends Animals{
    private String habitat;
    private int speed;

    public Mammals(String name, int years, String habitat, int speed) {
        super(name, years);
        this.habitat = habitat;
        this.speed = speed;
    }

    public String getHabitat() {
        return habitat;
    }

    public int getSpeed() {
        return speed;
    }

    public void walk() {
        System.out.println("Гулять");
    }

    @Override
    public String toString() {
        return "Mammals{" +
                "habitat='" + habitat + '\'' +
                ", speed=" + speed +
                "} " + super.toString();
    }
}
