class SearchElement {
    public static int search(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;  // return index if found
            }
        }
        return -1;  // return -1 if not found
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 14};
        int x = 14;
        int result = search(arr, x);

        if (result == -1) {
            System.out.println(x + " is not found in the array");
        } else {
            System.out.println(x + " is found at index " + result);
        }
    }
}
