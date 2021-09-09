public class ForStatement {
    public static void main(String[] args) {
        /**
         * for(init, condition, statement){
         *     magic here ...
         * }
         * */

        // looping without stop
        /*
        for(;;){
            System.out.println("Hello");
        }
        */

        // loop with condition
        /*
        var counter = 1;
        for(; counter <= 10; ){
            System.out.println("Perulangan ke - "+counter);
            counter++;
        }
        */

        // loop with init statement
        /*
        for (var counter = 1; counter <= 10 ;) {
            System.out.println("Perulanga ke - "+counter);
            counter++;
        }
        */

        // loop with ini statement
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }System.out.println();
        }
    }
}
