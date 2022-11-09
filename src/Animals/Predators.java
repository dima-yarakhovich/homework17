package Animals;

public class Predators extends  Mammals{
    private String food;

    public Predators(String name, int years, String habitat, int speed, String food) {
        super(name, years, habitat, speed);
        this.food = food;
    }

    public String getFood() {
        if (food.isEmpty() || food == null || food.isBlank()) {
            this.food = "default";
        }
        return food;
    }

    public void hunt() {
        System.out.println("Охотиться");
    }

    @Override
    public String toString() {
        return "Кличка животного: " +getName()+", Количество лет: "+getYears() +", Среда проживания: "+getHabitat()+", Скорость перемещения: "+getSpeed() + ", Тип пищи: " + getFood() +  super.toString();
    }
}
