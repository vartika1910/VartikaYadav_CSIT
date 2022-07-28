class interpolationSearch {

    public static int search(int arr[], int lo, int hi, int x) {
        int pos;

        if (lo <= hi && x >= arr[lo] && x <= arr[hi]) {
            pos = lo + (((hi - lo) / (arr[hi] - arr[lo])) * (x - arr[lo]));
            if (arr[pos] == x)
                return pos;
            if (arr[pos] < x)
                return search(arr, pos + 1, hi, x);
            if (arr[pos] > x)
                return search(arr, lo, pos - 1, x);
        }
        return -1;
    }

    public static void main(String args) {
        int n = 9; // Size of Array
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // Array to be searched
        int x = 8; // Element to be searched

        int result = search(arr, 0, n - 1, x);
        if (result == -1) {
            System.out.println("Element not found in Array.");
        } else {
            System.out.println("Element Found at " + result + " Position.");
        }
    }
}
