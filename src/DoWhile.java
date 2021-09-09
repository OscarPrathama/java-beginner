public class DoWhile {
    public static void main(String[] args) {
        var counter = 100;

        do {
            System.out.println("Perulangan ke " + counter);
            counter -= 10;
        }while (counter >= 10);
    }
}
