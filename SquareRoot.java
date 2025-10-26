public class SquareRoot {
    public static void main(String[] args) {
        /* double sq = Math.sqrt(25);   //math is a class under the java.lang package
        System.out.println("Square root is " + sq); */

        int num = 25; // Change this number if you want
        int i = 1;

        // Keep trying until i*i is greater than num
        while (i * i <= num) {
            i++;
        } 
        System.out.println("Square root of " + num + " is: " + (i - 1));         // The square root is i-1 (floor value)
    }

    
}
/* We start from i = 1 because:
We are trying to find the square root of a positive number.
The square root of any positive number is always greater than or equal to 1 (except for 0, which is a special case).
So we start checking from 1 upwards: */

/* for (i = 1; i * i <= num; i++) {
        // loop body can be empty because all work is done in the condition and increment
        }
        System.out.println("Square root of " + num + " is: " + (i - 1)); // floor square root
} */
