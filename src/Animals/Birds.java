package Animals;

public class Birds extends  Animals{
    private String habitat;

    public Birds(String name, int years, String habitat) {
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
        return "Birds{" +
                "habitat='" + habitat + '\'' +
                "} " + super.toString();
    }
}
