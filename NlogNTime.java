public class Main {
    public static void main(String[] args) {
        int n = 10; 

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= Math.log(n) + 1; j++) {
                System.out.println("(" + i + ", " + j + ")");
            }
        }
    }
}
