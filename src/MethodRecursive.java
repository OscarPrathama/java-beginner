public class MethodRecursive {

    public static void main(String[] args) {
        // Factorial loop
        // System.out.println( factorial(5) );

        // Factorial recursive
        System.out.println( factorialRecursive(5) );
    }

    /*factorial loop
    static int factorial(int value){
        var result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i;
        }
        return result;
    }
    */

    // factorial recursive
    static int factorialRecursive(int value){
        if(value == 1){
            return 1;
        }else{
            return value * factorialRecursive(value - 1);
        }
    }

}
