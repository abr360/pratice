public class revSelectionSort {
    public static void main(String[] args) {
        int a[] = {10, 9, 26, 29, 18, 2, 20, 7, 19, 15};
    
        for (int i = 0; i < a.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] > a[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = a[i];
            a[i] = a[maxIndex];
            a[maxIndex] = temp;
        }
        System.out.print("The selection sorted array in descending order: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
}
