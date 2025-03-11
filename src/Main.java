import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /**
         * @Note
         *      to declare an array of any type you need to put the reserve key then []
         * @ex
         * int[]
         * String[]
         * float[]
         *      You can set a new variable of an array to something of the its default value by
         *      declaring a new class with number of length as its initializer
         * @e.g
         * int[] testNumbers = new int[4]
         *
         * @Note2
         *      If you print out the array directly @Java will only print the address of the array inside memory
         *      To print it you Need to convert It into string first
         *      The Arrays.toString() returns string
         * @ex
         *         int[] numbers = new int[5];
         *         numbers[0] = 1;
         *         numbers[1] = 2;
         *         System.out.println(Arrays.toString(numbers));
         * */
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(Arrays.toString(numbers));
        /**
         * @NOTE
         *      Above is the older ways to declare
         * @Remember!!
         * @Array has a fixed (size) length and can never be removed
         * */
        int[] numbers2 = {3,2,1,4,5};
        System.out.println("Before sorting"+Arrays.toString(numbers2));
        /**
         * @Sorting
         * */
        Arrays.sort(numbers2);
        System.out.println("After sorting "+Arrays.toString(numbers2));

        /**
         * @MultidemensionsArrays
         * @NOTE**
         *      THE Arrays.toString() method is not possible when working with Multidimensional Arrays
         *      To print it out you need to use
         * @Arrays.deepToString()
         * @ex
         * System.out.println(Arrays.deepToString(matrix));
         *
         * @Decalre Multidimensional Arrays by normal means
         * int[][] matrix =new int[2][3];
         * @Decalre Multidimensional Arrays with {}
         * int[][] matrix ={{1,2,3},{1,2,3}};
         *
         * */
        int[][] matrix =new int[2][3];
        System.out.println(Arrays.deepToString(matrix));

        /**
         * @NOTE
         *      To declare a constant you need to use the keyword
         * @final which mean finalize
         * @e.g
         *      final byte number = 1
         *
         * */
        final byte number=1;
        /**
         * @Assign
         *      If you try to assign the new value to the final
         *      variable it will show the compilation error
         *
         * @Cannot assign a value to final variable '<variable_name>'
         * */
        System.out.println(number);
    }
}