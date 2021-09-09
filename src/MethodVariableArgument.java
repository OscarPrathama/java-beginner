public class MethodVariableArgument {

    public static void main(String[] args) {
        sayCongrats("Masgan", 12, 3, 1, 1, 5);
        sayCongrats("Joni", 82, 83, 85, 65, 99);
    }

    /**
     * Kadang kita butuh mengirim data ke dalam method, dengan data yang tidak pasti isinya
     * Biasanya pada kasus seperti ini kita menggunakan array untuk mengatasinya
     * Namun di Java, kita bisa menggunakan variable argument untuk mengirim data yang berisi jumlah tak tentu
     * Parameter dengan tipe variable argument, hanya bisa ditempatkan di posisi akhir parameter
     * */

    static void sayCongrats(String name, int... values){
        int total = 0;
        for(var value : values){
            total += value;
        }

        int finalValue = total / values.length;
        if(finalValue >= 75){
            System.out.println("Selamat " + name + " Anda lulus");
        }else{
            System.out.println(name + " gagal");
        }
    }

}
