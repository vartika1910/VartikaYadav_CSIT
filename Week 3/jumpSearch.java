public class jumpSearch {

    public static int search(int arr[], int x, int start, int end) {
        for (int i = start; i < end; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args) {
        int n = 9; // Size of Array
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // Array to be searched
        int x = 8; // Element to be searched
        int m = (int) Math.floor(Math.sqrt(9));
        int result = -1;
        for (int i = 0; i < n; i += m) {
            if (i > n) {
                result = search(arr, x, i - m, n);
                break;
            }
            if (arr[i] == x) {
                result = i;
                break;
            } else if (arr[i] > x) {
                result = search(arr, x, i - m, i);
            }
        }
        if (result == -1) {
            System.out.println("Element not found in Array.");
        } else {
            System.out.println("Element Found at " + result + " Position.");
        }
    }
}