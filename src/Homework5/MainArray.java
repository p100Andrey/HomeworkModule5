package Homework5;


public class MainArray {
    public static void main(String[] args) {
        int[] a = {-10, -5, 0, 5, 10};
        int max = a[0];
        int min = a[0];
        for (int i = 0; i != a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Max element: " + max);
        System.out.println("Min element: " + min);
    }
}
