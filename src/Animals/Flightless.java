package Animals;

public class Flightless  extends  Birds {
    private String movementType;

    public Flightless(String name, int years, String habitat, String movementType) {
        super(name, years, habitat);
        this.movementType = movementType;
    }

    public String getMovementType() {
        return movementType;
    }

    public void walk() {
        System.out.println("Гулять");
    }

    @Override
    public String toString() {
        return "Flightless{" +
                "movementType='" + movementType + '\'' +
                "} " + super.toString();
    }
}
