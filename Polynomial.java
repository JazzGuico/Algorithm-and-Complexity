public class Main {
    public static void main(String[] args) {
        int n = 4; 

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    System.out.println("(" + i + ", " + j + ", " + k + ")");
                }
            }
        }
    }
}
