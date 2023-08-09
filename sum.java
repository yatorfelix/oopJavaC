import java.util.Scanner;

class Add {
    private int num1, num2, num3, sum;

    public void get() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        num1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        num2 = scanner.nextInt();
        System.out.println("Enter the third number:");
        num3 = scanner.nextInt();
    }

    public int addition1() {
        sum = num1 + num2;
        System.out.println("The result is " + sum);
        return sum;
    }

    public int addition2() {
        sum = num1 + num2 + num3;
        System.out.println("The result is " + sum);
        return sum;
    }
}

public class Main {
    public static void main(String[] args) {
        Add a = new Add();
        a.get();
        a.addition1();
        a.addition2();
    }
}
