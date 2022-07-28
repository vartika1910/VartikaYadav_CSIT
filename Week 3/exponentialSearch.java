import java.util.*;

class exponentialSearch {

    public static int search(int arr[], int n, int x) {
        if (arr[0] == x)
            return 0;
        int i = 1;
        while (i < n && arr[i] <= x)
            i = i * 2;
        return Arrays.binarySearch(arr, i / 2, Math.min(i, n - 1), x);
    }

    public static void main(String args) {
        int n = 9; // Size of Array
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // Array to be searched
        int x = 8; // Element to be searched

        int result = search(arr, n, x);
        if (result == -1) {
            System.out.println("Element not found in Array.");
        } else {
            System.out.println("Element Found at " + result + " Position.");
        }
    }
}
