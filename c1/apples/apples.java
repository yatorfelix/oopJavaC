class Person {
    private int greenApples;
    private int redApples;
    private int greenAppleCost;
    private int redAppleCost;

    public Person(int greenApples, int redApples, int greenAppleCost, int redAppleCost) {
        this.greenApples = greenApples;
        this.redApples = redApples;
        this.greenAppleCost = greenAppleCost;
        this.redAppleCost = redAppleCost;
    }

    public int getGreenAppleCost() {
        return greenApples * greenAppleCost;
    }

    public int getRedAppleCost() {
        return redApples * redAppleCost;
    }
}

public class AppleCostCalculator {
    public static void main(String[] args) {
        int greenAppleCost = 31;
        int redAppleCost = 26;

        Person felix = new Person(36, 13, greenAppleCost, redAppleCost);
        Person peter = new Person(14, 16, greenAppleCost, redAppleCost);
        Person maxwell = new Person(6, 21, greenAppleCost, redAppleCost);

        System.out.println("Felix's green apple cost is" + felix.getGreenAppleCost());
        System.out.println("Felix's red apple cost is " + felix.getRedAppleCost());
        System.out.println("Peter's green apple cost is" + peter.getGreenAppleCost());
        System.out.println("Peter's red apple cost is " + peter.getRedAppleCost());
        System.out.println("Maxwell's green apple cost is " + maxwell.getGreenAppleCost());
        System.out.println("Maxwell's red apple cost is " + maxwell.getRedAppleCost());
    }
}