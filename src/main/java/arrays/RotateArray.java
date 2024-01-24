package arrays;
import java.util.Arrays;
public class RotateArray {
    public static void main(String[] args) {

        int [] rotate = {15, 12, 3, 9, 5, 10, 7};
        int[] newarray = new int[rotate.length];

        for (int i = 2; i < rotate.length; i++) {

            newarray[i-2] = rotate[i];

        }
        for(int i = 0; i < 2; i++) {
            newarray[rotate.length-2+i] = rotate[i];
        }

        System.out.println(Arrays.toString(newarray));
    }

}


