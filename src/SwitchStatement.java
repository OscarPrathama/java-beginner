public class SwitchStatement {
    public static void main(String[] args) {
        // var nilai = "B";
        var nilai = "A";

        switch (nilai){
            case "A":
                System.out.println("Baik");
                break;
            case "B":
            case "C":
                System.out.println("Lumayan");
                break;
            case "D":
                System.out.println("Buruk");
                break;
            default:
                System.out.println("Ulang Kelas");
        }
    }
}
