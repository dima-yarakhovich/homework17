package Animals;

public class Flying extends Birds{
    private String movementType;

    public Flying(String name, int years, String habitat, String movementType) {
        super(name, years, habitat);
        this.movementType = movementType;
    }

    public String getMovementType() {
        if (movementType.isEmpty() || movementType == null || movementType.isBlank()) {
            this.movementType = "default";
        }
        return movementType;
    }

    public void fly() {
        System.out.println("Летать");
    }

    @Override
    public String toString() {
        return "Кличка животного: " +getName()+", Количество лет: "+getYears() +", Среда проживания: "+getHabitat()+ ", Тип передвижения: " +getMovementType() +  super.toString();
    }
}
