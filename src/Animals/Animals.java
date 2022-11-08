package Animals;

import java.util.Objects;

public class Animals {
    protected String name;
    protected int years;

    public Animals(String name, int years) {
        this.name = name;
        this.years = years;
    }

    public String getName() {
        if (name.isEmpty() || name == null || name.isBlank()) {
            this.name = "default";
        }
        return name;
    }

    public int getYears() {
        if (years <= 0) {
            this.years = 1;
        }
        return years;
    }

    public void eat() {
        System.out.println("Кушать");
    }
    public void sleep() {
        System.out.println("Спать");
    }
    public void go() {
        System.out.println("Перемещаться");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Animals animals = (Animals) o;
        return years == animals.years && Objects.equals(name, animals.name);
    }


    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", years=" + years +
                '}';
    }
}
