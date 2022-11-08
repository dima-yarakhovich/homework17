package Animals;

public class Herbivores extends  Mammals {
    private String food;

    public Herbivores(String name, int years, String habitat, int speed, String food) {
        super(name, years, habitat, speed);
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public void fawn() {
        System.out.println("Паститься");
    }

    @Override
    public String toString() {
        return "Herbivores{" +
                "food='" + food + '\'' +
                "} " + super.toString();
    }
}
