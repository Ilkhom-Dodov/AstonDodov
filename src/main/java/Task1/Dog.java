package Task1;

public class Dog extends Animal {
    private String name;
    private int runCounter = 0;
    private int swimCounter;
    private static int numberOfDogs;

    public Dog (String name) {
        super();
        numberOfDogs++;
        this.name = name;
    }

    @Override
    void run (int distance) {
        if (this.runCounter + distance <= 500) {
            System.out.println(this.name + " пробежал(а) " + distance + " м.");
            this.runCounter += distance;
        } else {
            System.out.println(this.name + " не может столько пробежать." + " " + this.name + " может пробежать еще " + (500 - this.runCounter));
        }
    }

    @Override
    void swim(int distance) {
        if (this.swimCounter + distance <= 10) {
            System.out.println(this.name + " проплыл(а) " + distance + " м.");
            this.swimCounter += distance;
        } else {
            System.out.println(this.name + " не сможет столько проплыть");
        }
    }

    public static int getNumberOfDogs() {
        return numberOfDogs;
    }
}
