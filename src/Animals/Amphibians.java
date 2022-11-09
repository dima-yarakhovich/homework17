package Animals;

public class Amphibians  extends Animals{
    private String habitat;

    public Amphibians(String name, int years, String habitat) {
        super(name, years);
        this.habitat = habitat;
    }

    public String getHabitat() {
        if (habitat.isEmpty() || habitat == null || habitat.isBlank()) {
            this.habitat = "default";
        }
        return habitat;
    }

    public void hunt() {
        System.out.println("Охотиться");

    }

    @Override
    public String toString() {
        return "Кличка животного: " +getName()+", Количество лет: "+getYears() +", Среда проживания: "+getHabitat()+ super.toString();
    }
}
