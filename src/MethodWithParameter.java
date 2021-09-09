public class MethodWithParameter {
    public static void main(String[] args) {
        sayHello("Masgan", "Thama");
    }

    static void sayHello(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
