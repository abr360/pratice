public class StringOfCharSort {
    public static void main(String[] args) {
        // Sample input string
        String input = "albright raj";

        // Convert the string to a character array
        char[] characters = input.toCharArray();

        // Sort the character array using selection sort
        selectionSort(characters);

        // Convert the sorted character array back to a string
        String sortedString = new String(characters);

        // Display the sorted string
        System.out.println("Sorted string: " + sortedString);
    }

    public static void selectionSort(char[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted part
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element of the unsorted part
            if (minIndex != i) {
                char temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}
