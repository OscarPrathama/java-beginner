public class SwitchStatementTanpaYield {
    public static void main(String[] args) {

        /**
         * pada java 14 terdapat keyword yield untuk mengembalikan nilai pada switch statement
         * ini sangat mempermudah saat kita butuh membuat data berdasarkan switch statement
         * */

        var nilai = "A";
        String ucapan;

        switch (nilai){
            case "A" -> ucapan = "Baik";
            case "B", "C" -> ucapan = "Lumayan";
            case "D" -> ucapan = "Jelek";
            default -> ucapan = "Ulang kelas";
        }
        System.out.println(ucapan);

    }
}
