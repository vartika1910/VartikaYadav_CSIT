public class recursiveBinarySearch {

    public static int search(int arr[], int x, int low, int high) {
        int mid = low + (high - 1) / 2;

        if (high < low)
            return -1;

        if (arr[mid] == x)
            return mid;
        else if (arr[mid] < x) {
            return search(arr, x, mid + 1, high);
        } else {
            return search(arr, x, low, mid - 1);
        }
    }

    public static void main(String args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // Array to be searched
        int x = 8; // Element to be searched
        int result = search(arr, x, 0, 9);
        if (result == -1) {
            System.out.println("Element not found in Array.");
        } else {
            System.out.println("Element Found at " + result + " Position.");
        }
    }
}
