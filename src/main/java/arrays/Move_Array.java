package arrays;
import java.util.Arrays;

public class Move_Array {
    public static void main(String[] args) {
        int[] numbers = {0, 2, 0, 5, 0, 7, 9, -1, 3};

        System.out.println("Original Array: " + Arrays.toString(numbers));

        moveZerosToEnd(numbers);

        System.out.println("Array after moving 0's to the end: " + Arrays.toString(numbers));
    }

    // Function to move all 0's to the end of the array
    private static void moveZerosToEnd(int[] nums) {
        int nonZeroIndex = 0;

        // Iterate through the array
        for (int num : nums) {
            if (num != 0) {
                nums[nonZeroIndex++] = num;
            }
        }

        // Fill the remaining positions with 0
        while (nonZeroIndex < nums.length) {
            nums[nonZeroIndex++] = 0;
        }
    }
}
