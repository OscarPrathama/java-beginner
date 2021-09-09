public class BreakNContinue {
    public static void main(String[] args) {
        /*
        * break
        var counter = 1;
        while(true){
            System.out.println("Perulangan ke "+counter);
            counter++;
            if(counter > 10){
                break;
            }
        }
        */

        // continue
        for (int i = 0; i <= 10; i++) {
            if(i%2 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
