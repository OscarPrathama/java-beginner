public class SwitchStatementLambda {
    public static void main(String[] args) {
        /**
         * pada Java versi 14 diperkenalkan switch expression dengan lambda
         * ini lebih mempermudah saat penggunaan switch expression karena kita tidak perlu lagi menggunakan kata kunci break
         * */

        // var nilai = "B";
        var nilai = "A";

        switch (nilai){
            case "A" -> System.out.println("Baik");
            case "B", "C" -> System.out.println("Biasa");
            case "D" -> System.out.println("Jelek");
            default -> {
                System.out.println("Ulang kelas");
            }
        }
    }
}
