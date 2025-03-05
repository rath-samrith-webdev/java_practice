import java.util.Date;

public class Main {
    public static void main(String[] args) {
        /**
         * @PrimitiveTypes is used to store simple values
         * <byte> size in bytes = 1 can store from -128 to 127
         * <short> size in bytes = 2 can store from -32000 to 32000 //
         * <int> size in bytes = 4 can store from -2Billion to 2Billion //1,2,4
         * <long> size in bytes = 8  //123
         * <float> size in bytes = 4  //5.29f
         * <double> size in bytes = 8 //4.52d
         * <char> size in bytes = 2  //Single character e.g. 'A'
         * <boolean> size in bytes = 1
         *
         * @Note
         *      you can use underscore (_) to separate number //123_123_123
         *      someNumber<suffix>
         *          the suffix represent type of the variable and prevent compilation errors
         *          <reserve_keyword> variable = value
         *          the reserve_keywords cannot be used to name the variables in JAVA
         * */

        /**
         * @ReferenceTypes are the type which can be referenced like the Type Date it is used to store
         *      complex @Objects, the data stores in a memory is completely independent of each other.
         *      this type when reference it shows the methods which we can use to access
         *      let's just say we can access it methods through the instances created with that types.
         * @example
         *      Date now=new Date();
         *      System.out.println(now);
         *
         *
         *
         *
         *
         *
         *
         *
         *
         * */
        byte myAge=30;
        Date now=new Date();
        System.out.println(now);
    }
}