public class Fibonacci {
    public static int sumOfEvenFibonacci(int limit) {
        int a = 1, b = 2, sum = 0;

        while (b <= limit) {
            if (b % 2 == 0) {
                sum += b;
            }

            int temp = a + b;
            a = b;
            b = temp;
        }

        return sum;
    }
}
