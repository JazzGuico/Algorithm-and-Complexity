import java.util.Scanner;

class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        int base = sc.nextInt();

        System.out.print("Enter the exponent: ");
        int exponent = sc.nextInt();

        long result = 1;
        for (int i = 0; i < Math.abs(exponent); i++) {
            result *= base;
        }

        if (exponent < 0) {
            System.out.println("Answer = " + (1.0 / result));
        } else {
            System.out.println("Answer = " + result);
        }

        sc.close();
    }
}
