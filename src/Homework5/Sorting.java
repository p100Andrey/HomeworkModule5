package Homework5;


public class Sorting {
    public static void main(String[] args) {
        int[] a = {99, 10, -5, 0, 5, -10, 2};
        sortArray(a);
        printArray(a);
    }

    private static void sortArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int iMin = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] <  a[iMin]) {
                    iMin = j;
                }
            }
            if (a[iMin] < a[i]) {
                int temp = a[i];
                a[i] = a[iMin];
                a[iMin] = temp;
            }
        }
    }

    private static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}