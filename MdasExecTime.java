public class GuicoMdasExecTime {
    public static void mdas(int a, int b) {
        long startTime = System.nanoTime();
        
        int sum = a + b;
        int product = a * b;
        int difference = a - b;
        double quotient = (b != 0) ? ((double) a / b) : 0;
        
        long endTime = System.nanoTime();
        
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Difference: " + difference);
        System.out.println("Quotient: " + quotient);
        System.out.println("Execution Time (ns): " + (endTime - startTime));
    }
    
    public static void main(String[] args) {
        mdas(10, 5);
    }
}
