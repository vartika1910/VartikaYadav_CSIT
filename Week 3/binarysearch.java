public class binarySearch {
    public static void main(String args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // Array to be searched
        int x = 8; // Element to be searched

        int low = 0, high = 9;
        int mid, fg = 0;
        while (low <= high) {
            mid = low + (high - 1) / 2;
            if (arr[mid] == x) {
                System.out.println("Element Found at " + mid + " Position.");
                fg = 1;
                break;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (fg == 0) {
            System.out.println("Element not found in Array.");
        }
    }
}
