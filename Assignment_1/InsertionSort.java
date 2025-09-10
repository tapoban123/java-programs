import java.util.Scanner;

class InsertionSort {
    static void displayArr(int[] arr) {
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);
        System.out.print("Enter range: ");
        int range = inputObj.nextInt();

        int[] arr = new int[range];

        for (int i = 0; i < range; i++) {
            System.out.print("Enter an element: ");
            arr[i] = inputObj.nextInt();
        }

        inputObj.close();
        System.out.print("\nUnsorted Elements = ");
        displayArr(arr);

        int j, temp;
        for (int i = 0; i < range; i++) {
            j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }

        System.out.print("Sorted Elements = ");
        displayArr(arr);
    }
}
