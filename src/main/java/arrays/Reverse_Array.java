package arrays;

public class Reverse_Array {
    public static void main(String[] args) {
        int[] originalArray = {5, 2, 10, 4, 9};

        System.out.println("Original Array:");
        printArray(originalArray);

        int[] reversedArray = reverse(originalArray);

        System.out.println("\nReversed Array:");
        printArray(reversedArray);
    }

    public static int[] reverse(int[] array) {
        int length = array.length;
        int[] reversedArray = new int[length];

        for (int i = 0; i < length; i++) {
            reversedArray[i] = array[length - 1 - i];
        }

        return reversedArray;
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

