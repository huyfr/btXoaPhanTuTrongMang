public class Main {
    public static void main(String[] args) {
        int[] array=new int[RemoveValue.enterSizeArray()];
        RemoveValue.enterNumberToArray(array);
        System.out.println("Before: ");
        RemoveValue.displayArray(array);
        System.out.println();
        int number;
        number= RemoveValue.enterNumberToCheck();
        RemoveValue.removeNumberInArray(array, number);
        System.out.println("After: ");
        RemoveValue.displayArray(array);
    }
}