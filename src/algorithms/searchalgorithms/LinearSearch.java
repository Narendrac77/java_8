package src.algorithms.searchalgorithms;

public class LinearSearch {

    public static void main(String[] args) {
        test1();
        test2();
    }

    public static void test1() {
        int arr[] = {10, 20, 80, 30, 60, 50, 100, 110, 130, 170};
        int x = 110;
        System.out.println(search(arr, x));
    }

    public static void test2() {
        int arr[] = {10, 20, 80, 30, 60, 50, 100, 110, 130, 170};
        int x = 175;
        System.out.println(search(arr, x));
    }

    static int search(int arr[], int number) {
        if (arr.length <= 0) {
            return -1;
        }
        for (int i = 0; i < arr.length - 1; ) {
            if (arr[i] == number)
                return i;
            i++;
        }
        return -1;
    }
}
