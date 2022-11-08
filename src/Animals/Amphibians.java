package Animals;

public class Amphibians  extends Animals{
    private String habitat;

    public Amphibians(String name, int years, String habitat) {
        super(name, years);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void hunt() {
        System.out.println("Охотиться");

    }

    @Override
    public String toString() {
        return "Amphibians{" +
                "habitat='" + habitat + '\'' +
                "} " + super.toString();
    }
}
