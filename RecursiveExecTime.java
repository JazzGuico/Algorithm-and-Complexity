public class GuicoRecursiveExecTime {
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    public static void main(String[] args) {
        int n = 10;
        long startTime = System.nanoTime();
        int result = fibonacci(n);
        long endTime = System.nanoTime();
        
        System.out.println("Fibonacci(" + n + ") = " + result);
        System.out.println("Execution Time (ns): " + (endTime - startTime));
    }
}
