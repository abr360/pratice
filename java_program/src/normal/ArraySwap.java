/**
 1. Write a program in java  to quickly swap two arrays(without build in method ).
Sample Input :
a[]={11,12,13,14}
b[]={15,16,17,18}

Sample Output:
a[]={15,16,17,18}
b[]={11,12,13,14}
 */

public class ArraySwap {
    public static void main(String[] args) {
        // Sample input arrays
        int[] a = {11, 12, 13, 14};
        int[] b = {15, 16, 17, 18};

        // Display original arrays
        System.out.println("Original arrays:");
        printArray("a", a);
        printArray("b", b);

        // Swap the arrays
        swapArrays(a, b);

        // Display swapped arrays
        System.out.println("\nSwapped arrays:");
        printArray("a", a);
        printArray("b", b);
    }

    public static void swapArrays(int[] a, int[] b) {
        // Check if the arrays are of the same length
        if (a.length != b.length) {
            System.out.println("Arrays are of different lengths and cannot be swapped.");
            return;
        }

        // Create a temporary array to hold the values of array a
        int[] temp = new int[a.length];

        // Copy elements of array a to temporary array
        for (int i = 0; i < a.length; i++) {
            temp[i] = a[i];
        }

        // Copy elements of array b to array a
        for (int i = 0; i < a.length; i++) {
            a[i] = b[i];
        }

        // Copy elements from temporary array to array b
        for (int i = 0; i < a.length; i++) {
            b[i] = temp[i];
        }
    }

    public static void printArray(String name, int[] array) {
        System.out.print(name + "[]={");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("}");
    }
}
