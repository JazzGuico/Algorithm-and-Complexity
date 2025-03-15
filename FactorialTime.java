public class Main {

    public static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int n = 4; // Example: Calculate factorial of 4

        long fact_n = factorial(n);

        for (long i = 1; i <= fact_n; i++) {
            System.out.println(i);
        }
    }
}
