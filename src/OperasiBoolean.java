public class OperasiBoolean {
    public static void main(String[] args) {
        int nilai = 80;
        int absen = 70;

        var lulusAbsen = absen >= 70;
        var lulusNilai = nilai >= 70;

        System.out.println( lulusAbsen && lulusNilai );
    }
}
