public class TestAnimal {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();

        Animal sheep = registry.createSheep("Lottie Bie");
        Animal cow = registry.createCow();
        Animal horse = registry.createHorse();

        sheep.makeSound();
        cow.makeSound();
        horse.makeSound();
    }
}