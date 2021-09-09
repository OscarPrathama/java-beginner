public class SwitchStatementDenganYield {
    public static void main(String[] args) {
        var nilai = "A";

        String ucapan = switch (nilai){
            case "A":
                yield "Baik";
            case "B", "C":
                yield "Lumayan";
            case "D":
                yield "Jelek";
            default:
                yield "ulang kelas";
        };
        System.out.println(ucapan);
    }
}
