public class Foreach {
    public static void main(String[] args) {
        String[] array = {
                "Bakso", "Mie Ayam", "Nasi Goreng", "Nasi Padang"
        };

        for(var value : array){
            System.out.println(value);
        }
    }
}
