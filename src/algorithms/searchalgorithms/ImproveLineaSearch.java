package src.algorithms.searchalgorithms;

//if element Found at last  O(n) to O(1)
//It is the same as previous method because here we are performing 2 ‘if’ operations in one iteration of the loop and in previous method we performed only 1
// ‘if’ operation. This makes both the time complexities same.
public class ImproveLineaSearch {

    public static void main(String[] args) {
        test1();
        test2();
    }

    public static void test1() {
        int arr[] = {10, 20, 80, 30, 60, 50, 100, 110, 130, 170};
        int x = 110;
        search(arr, x);
    }

    public static void test2() {
        int arr[] = {10, 20, 80, 30, 60, 50, 100, 110, 130, 170};
        int x = 175;
        search(arr, x);
    }

    static void search(int arr[], int element) {
        int left = 0;
        int right = arr.length - 1;
        int position = -1;
        while (left <= right) {
            if (arr[left] == element) {
                position = left;
                break;
            }
            if (arr[right] == element) {
                position = right;
                break;
            }
            left++;
            right--;
        }
        System.out.println("element present at position " + position);

    }
}
