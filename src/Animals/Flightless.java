package Animals;

public class Flightless  extends  Birds {
    private String movementType;

    public Flightless(String name, int years, String habitat, String movementType) {
        super(name, years, habitat);
        this.movementType = movementType;
    }

    public String getMovementType() {
        if (movementType.isEmpty() || movementType == null || movementType.isBlank()) {
            this.movementType = "default";
        }
        return movementType;
    }

    public void walk() {
        System.out.println("Гулять");
    }

    @Override
    public String toString() {
        return "Кличка животного: " +getName()+", Количество лет: "+getYears() +", Среда проживания: "+getHabitat()+ ", Тип передвижения: " +getMovementType() +  super.toString();

    }
}
