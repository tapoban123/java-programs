import java.util.Scanner;

class MInAndMax {
    static void displayArr(int[] arr) {
        System.out.print("Elements = ");
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);

        System.out.print("Enter the length of array: ");
        int length = inputObj.nextInt();

        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Enter an element: ");
            arr[i] = inputObj.nextInt();
        }
        inputObj.close();

        displayArr(arr);

        int min = arr[0], max = arr[1];
        for (int i : arr) {
            if (i > max)
                max = i;
            if (i < min)
                min = i;
        }

        System.out.println("Maximum = " + max + " and " + "Minimum = " + min);
    }
}
