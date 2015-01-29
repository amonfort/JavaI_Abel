/**
 * Created by abel on 28-01-2015.
 */
public class ArraysToMethods {

    public static void main(String[] args) {


        printArray(new int[]{3, 1, 2, 6, 4, 2});

    }

    public static void printArray ( int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}