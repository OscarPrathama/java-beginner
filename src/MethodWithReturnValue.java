public class MethodWithReturnValue {
    public static void main(String[] args) {
        var a = 100;
        var b = 200;
        var c = 300;
        var d = sum(a, b, c);

        System.out.println(d);
    }

    /**
     * agar method yang kita buat menghasilkan return value, kita harus mengubah kata kunci void dengan tipe data yang ingin kita hasilkan
     * dan di dalam methodnya kita harus menggunakan kata kunci return
     * */
    static int sum(int value1, int value2, int value3){
        var total = value1 + value2 + value3;
        return total;
    }
}
