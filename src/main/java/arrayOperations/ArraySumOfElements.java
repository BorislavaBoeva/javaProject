package arrayOperations;

public class ArraySumOfElements {
    public static void main(String[] args) {
        int[] arr = new int[20];
        int sum = 0;
        double average;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 5;
            System.out.printf("Element in position %d is %d\n", i, arr[i]);
        }
        for (int i : arr) {
            sum += i;
        }
        average = (double) sum / arr.length;
        System.out.printf("Average of all stored elements of the array is: %.2f\n", average);
    }
}














