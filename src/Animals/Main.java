package Animals;


public class Main {
    public static void main(String[] args) {
        Herbivores gazelle = new Herbivores("Газик", 3, "Саванна", 80, "Трава и листья");
        Herbivores giraffe = new Herbivores("Короткий", 6, "Саванна", 40, "Трава и листья");
        Herbivores horse = new Herbivores("Гончий", 9, "Саванна", 70, "Трава и листья");
        Predators hyena = new Predators("Сухой", 4, "Саванна", 50, "Мясо");
        Predators tiger = new Predators("Полосатик", 8, "Саванна", 70, "Мясо");
        Predators bear = new Predators("Михалыч", 10, "Умеренный и холодный климат", 45, "Мясо");
        Amphibians adder = new Amphibians("Длинный", 1, "Умеренный и холодный климат");
        Amphibians frog = new Amphibians("Макака", 1, "Теплый и умеренный климат");
        Flightless peacock = new Flightless("Цветик", 2, "Джунгли", "Ходит");
        Flightless dodoBird = new Flightless("Гуля", 4, "Джунгли", "Ходит");
        Flightless penguin = new Flightless("Пухляш", 6, "Холодный климат", "Ходит, плавает");
        Flying gull = new Flying("Белка", 3, "Умеренный и холодный климат", "Летает");
        Flying albatross = new Flying("Крылатик", 5, "Умеренный и холодный климат", "Летает");
        Flying hawk = new Flying("Острый глаз", 4, "Умеренный и холодный климат", "Летает");
        System.out.println(horse.toString());
    }

}