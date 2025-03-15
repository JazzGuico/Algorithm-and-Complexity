public class Main {
    public static int binarySearch(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2; 
            if (arr[mid] < x) {
                low = mid + 1;
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                return mid; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 8, 11, 12};
        int x = 11;
        int result = binarySearch(arr, x);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}
