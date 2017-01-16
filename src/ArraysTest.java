import java.util.Arrays;

/**
 * Created by nedwaldie on 1/11/17.
 */
public class ArraysTest {
    public static void main(String[] args) {
        String[] animals = {"dog", "cat", "pig" , "cow"};

        System.out.println(Arrays.toString(animals));


        // Arrays.fill(arrayName, startingIndex(optional), endingIndex, value) method
        char[] grades = new char[5];
        Arrays.fill(grades,  'A');
        System.out.println(Arrays.toString(grades));

        // Arrays.equals(array1, array2) method

        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 2, 4, 3};

        System.out.println(Arrays.equals(array1, array2));

        // Array.copyOfRange(array, startIndex, endIndex) method

        String[] foodJustinLikes = {"hamburger", "pie", "potatoes", "kale", "peanut butter"};
        String[] foodPamLikes = Arrays.copyOf(foodJustinLikes, 3);
        System.out.println(Arrays.toString(foodJustinLikes));
        System.out.println(Arrays.toString(foodPamLikes));

        // sort
        String[] students = {"Ron", "John", "Kevin", "Jeff"};
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        // Arrays.binarySearch(array, value); have to sort first
        String[] hayStack = new String[100];
        Arrays.fill(hayStack, 0, 50, "hay");
        Arrays.fill(hayStack, 50, 100, "stack");
        hayStack[87] = "needle";
        Arrays.sort(hayStack);

        int index = Arrays.binarySearch(hayStack, "needle");
        System.out.println(index);

        // Two Dimensional Array
        int[][] spreadSheet = new int[6][6];

        for (int i = 0; i < spreadSheet.length; i++) {
            System.out.println("");
            for (int j = 0; j < spreadSheet[i].length; j++) {
                System.out.print(spreadSheet[i][j] + " ");
            }
        }

        System.out.println("\n");
        // Rectangle and jagged Arrays
        int [][] jaggedArray = new int[5][];

        int[] row1 = new int[3];
        int[] row2 = new int[10];
        int[] row3 = new int[5];
        int[] row4 = new int[7];
        int[] row5 = new int[2];

        jaggedArray[0] = row1;
        jaggedArray[1] = row2;
        jaggedArray[2] = row3;
        jaggedArray[3] = row4;
        jaggedArray[4] = row5;

        for (int[] singleArray : jaggedArray) {
            System.out.println(Arrays.toString(singleArray));
        }

    }
}
