import java.util.Scanner;

public class RemoveValue {

    public static int enterSizeArray() {
        int size;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = sc.nextInt();
            if (size > 10) {
                System.out.println("Size does not exceed 10");
            }
        } while (size > 10);
        return size;
    }

    public static void enterNumberToArray(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
    }

    public static void displayArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

    public static int enterNumberToCheck() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }

    public static boolean checkNumberInArray(int[] arr, int number) {
        for (int value : arr) {
            if (value == number) {
                return true;
            }
        }
        return false;
    }

    public static int indexNumberInArray(int[] arr, int number) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                index = i;
            }
        }
        return index;
    }

    public static void removeNumberInArray(int[] arr, int number) {
        int index;
        if (checkNumberInArray(arr, number)) {
            index = indexNumberInArray(arr, number);
            for (int i = index; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = 0;
        }
    }
}
