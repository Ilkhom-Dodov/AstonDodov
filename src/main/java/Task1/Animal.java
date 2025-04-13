package Task1;

public class Animal {

    private static int numberOfAnimals;

    public Animal() {
        numberOfAnimals++;
    }

    void run (int distance) {
        System.out.println("Животное пробежало " + distance + " м.");
    }

    void swim (int distance) {
        System.out.println("Животное проплыло " + distance + " м.");
    }

    public static int getNumberOfAnimals() {
        return numberOfAnimals;
    }
}

