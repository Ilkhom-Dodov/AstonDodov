package Task1;

public class Cat extends Animal {

    private String name;
    private int runCounter = 0;
    private static int numberOfCats;
    private boolean isFull = false;

    public Cat (String name) {
        super();
        this.name = name;
        numberOfCats++;
    }

    @Override
    void run (int distance) {
    if (this.runCounter + distance <= 200) {
            System.out.println(this.name + " Пробежал(а) " + distance + " м.");
            this.runCounter += distance;
        } else {
            System.out.println(this.name + " не может столько пробежать." + " " + this.name + " может пробежать еще " + (200 - this.runCounter));
        }

    }

    @Override
    void swim(int distance) {
        System.out.println(this.name + " не умеет плавать");
    }

    public static int getNumberOfCats() {
        return numberOfCats;
    }

    public void eatFromBowl(int amount) {
        if (Bowl.reduceFood(amount)) {
            System.out.println(this.name + " поел(а) и теперь сыт(а)");
            this.isFull = true;
        }
    }

    public boolean askIfCatIsFull () {
        return isFull;
    }

    public String getName() {
        return this.name;
    }
}
