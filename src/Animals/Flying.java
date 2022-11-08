package Animals;

public class Flying extends Birds{
    private String movementType;

    public Flying(String name, int years, String habitat, String movementType) {
        super(name, years, habitat);
        this.movementType = movementType;
    }

    public String getMovementType() {
        return movementType;
    }

    public void fly() {
        System.out.println("Летать");
    }

    @Override
    public String toString() {
        return "Flying{" +
                "movementType='" + movementType + '\'' +
                "} " + super.toString();
    }
}
