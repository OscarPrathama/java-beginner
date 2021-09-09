public class VariableVarKeyword {

    public static void main(String[] args) {

        /**
         * Sejak Java v10, Java mendukung pembuatan variabel dengan kata kunci var, sehingga kita tidak perlu menyebutkan tipe datanya
         * Saat kita menggunakan kata kunci var untuk membuat variable, kita harus langsung menginisialisasi nilainya secara langsung
         * */

        /*
        var name; // ini akan memunculkan error, krn tidak langsung meninisialisasi valuenya saat pendeklarasian keyword var
        name = "Budi Hartono";
        */

        var name = "Masgan";
        var age = 45;
        var address = "Indonesia";

        System.out.println(name +" "+ age +" "+ address);
    }

}
