public class VariableFinalKeyword {

    public static void main(String[] args) {

        /**
         * Secara default, variabel di Java bisa dirubah2 nilainya
         * Kalau kita ingin membuat variable yang datanya tidak boleh dirubah setelah di deklarasikan, kita bisa menggunakan kata kunci final
         * Istilah variabel seperti ini, disebut juga dengan istilah Constanta
         * */

        final String name = "Masgan";

        // name = "Thama"; // akan error karena var name yang memiliki keyword final mencoba untuk dirubah

        System.out.println(name);

    }

}
