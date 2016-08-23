package math;

/**
 * Created by mrahman on 4/9/16.
 */
public class Factorial {

    public static int iterationFactorial(int n){
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;

    }
    public static int recursionFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * recursionFactorial(n - 1);
        }
    }
    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        System.out.println("Factorial of 9 using iteration: "+ iterationFactorial(9));
        System.out.println("Factorial of 9 using recursion: "+ recursionFactorial(9));
    }
    }

