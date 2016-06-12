package Homework5;

public class ArrayUtils {
    public static int[] createArray(int size, int boundMin, int boundMax) {
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = getRandomInt(boundMin, boundMax);
        }
        return a;
    }

    private static int getRandomInt(int boundMin, int boundMax) {
        return (int) (boundMin + Math.random() * (boundMax - boundMin));
    }

    public static void sortArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int iMin = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[iMin]) {
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

    public static int maximum(int[] array) {
        int max = array[0];
        for (int i = 0; i != array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int minimum(int[] array) {
        int min = array[0];
        for (int i = 0; i != array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println();
    }

  /*  public static void main(String[] args) {
        long start, finish;
        int[] array = ArrayUtils.generateArray(100);
        System.out.println("Initial array:" + ArrayUtils.toString(array));
        System.out.println("Min: " + ArrayUtils.findMin(array));
        System.out.println("Max: " + ArrayUtils.findMax(array));
        start = System.nanoTime();
        ArrayUtils.selectionSort(array);
        finish = System.nanoTime();
        System.out.println("Selection sorted array: " + ArrayUtils.toString(array));
        System.out.println("Sorting finished in: " + (finish - start));
    }*/
}

