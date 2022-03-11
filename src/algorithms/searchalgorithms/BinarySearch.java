package src.algorithms.searchalgorithms;

public class BinarySearch {

    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
    }

    public static void test1() {
        int arr[] = {10, 20, 80, 30, 50, 60, 100 , 110, 130, 170};
        int x = 110;
        int result = search(arr, 0, arr.length - 1, x);
        int result2 = search2(arr, 0, arr.length - 1, x);
        System.out.println("Solution1 = " + result);
        System.out.println("Solution1 = " + result2);

    }

    public static void test2() {
        int arr[] = {10, 20, 80, 30, 50, 60, 100, 110, 130, 170};
        int x = 175;
       int result = search(arr, 0, arr.length - 1, x);
        int result2 = search2(arr, 0, arr.length - 1, x);
        System.out.println("Solution1 = " + result);
        System.out.println("Solution1 = " + result2);    }

    public static void test3(){
        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 10;
        int result = search(arr, 0, arr.length -1, x);
        int result2 = search2(arr, 0, arr.length - 1, x);
        System.out.println("Solution1 = " + result);
        System.out.println("Solution1 = " + result2);    }

    public static void test4(){
        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 40;
        int result = search(arr, 0, arr.length -1, x);
        int result2 = search2(arr, 0, arr.length - 1, x);
        System.out.println("Solution1 = " + result);
        System.out.println("Solution1 = " + result2);    }

    public static void test5() {
        int arr[] = {10, 20, 80, 30, 50, 60, 100, 110, 130, 170};
        int x = 20;
        int result = search(arr, 0, arr.length - 1, x);
        int result2 = search2(arr, 0, arr.length - 1, x);
        System.out.println("Solution1 = " + result);
        System.out.println("Solution1 = " + result2);
    }
    public static int search(int arr[], int left, int right, int k) {
        if (right >= left) {
            //int mid = left + (right-left)/ 2;
            int mid = (left + right)/2;
            if (arr[mid] == k)
                return mid;
            if (arr[mid] > k)
                return search(arr, left, mid - 1, k);

            return search(arr, mid + 1, right, k);
        }
        return -1;
    }

    public static int search2(int arr[], int left, int right, int k) {
        if (right >= left) {
            //int mid = left + (right-left)/ 2;
            int mid = (left + right)/2;
            if (arr[mid] == k)
                return mid;
            if (arr[mid] > k)
                return search(arr, left, mid - 1, k);

            return search(arr, mid + 1, right, k);
        }
        return -1;
    }

   /* int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }

    // Driver method to test above
    public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "
                    + result);
    }*/
}
