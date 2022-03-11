package src.algorithms.sortingalgorithms;

public class SelectionSort {

    static void sortElements(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minimumElement = i;
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[j] < arr[minimumElement]) {
                    int temp = arr[j];
                    arr[j] = arr[minimumElement];
                    arr[minimumElement] = temp;
                }
            }
        }
    }

    public static void main(String args[]) {
        test1();
    }

    public static void test1() {
        int arr[] = {64, 25, 12, 22, 11};
        sortElements(arr);
        printArray(arr);
    }

    public static void printArray(int arr[]){
        for (int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
