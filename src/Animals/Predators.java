package Animals;

public class Predators extends  Mammals{
    private String food;

    public Predators(String name, int years, String habitat, int speed, String food) {
        super(name, years, habitat, speed);
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public void hunt() {
        System.out.println("Охотиться");
    }

    @Override
    public String toString() {
        return "Predators{" +
                "food='" + food + '\'' +
                "} " + super.toString();
    }
}
