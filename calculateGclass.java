public class CalculateG {
    public static double gravity = -9.81;
    public static double fallingTime = 30;
    public static double initialVelocity = 0.0;
    public static double finalVelocity;
    public static double initialPosition = 0.0;
    public static double finalPosition;

    public static double multi(double a, double b) {
        return a * b;
    }

    public static void outline(double result) {
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        // Formulas for position and velocity
        finalPosition = 0.5 * gravity * Math.pow(fallingTime, 2) + initialVelocity * fallingTime + initialPosition;
        finalVelocity = gravity * fallingTime + initialVelocity;

        // Output position and velocity
        System.out.println("The object's position after " + fallingTime + " seconds is " + finalPosition + " m.");
        outline(finalVelocity);
    }
}
