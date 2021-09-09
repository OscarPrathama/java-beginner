public class IfElseIfStatement {
    public static void main(String[] args) {
        var nilai = 55;

        if(nilai <= 100 && nilai >= 90 ){
            System.out.println("A");
        }else if(nilai <= 89 && nilai >= 80){
            System.out.println("B");
        }else if(nilai <= 79 && nilai >= 60){
            System.out.println("C");
        }else if(nilai <= 59 && nilai >= 50){
            System.out.println("D");
        }else{
            System.out.println("E");
        }
    }
}
