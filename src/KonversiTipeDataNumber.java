public class KonversiTipeDataNumber {
    public static void main(String[] args) {

        // Widening Casting (Otomatis) : byte -> short -> int -> long -> float -> double
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;
        long iniLong = iniInt;
        float iniFloat = iniLong;
        double iniDouble = iniFloat;

        // Narrowing Casting (Manual) : double -> float -> long -> int -> char ->  short -> byte
        float iniFloat2 = (float) iniDouble;
        long iniLong2 = (long) iniFloat2;
        int iniInt2 = (int) iniLong2;
        short iniShort2 = (short) iniInt2;

        System.out.println(iniByte);
        System.out.println(iniShort);
        System.out.println(iniInt);
        System.out.println(iniLong);
        System.out.println(iniFloat);
        System.out.println(iniDouble);

        System.out.println("========================");

        System.out.println(iniFloat2);
        System.out.println(iniLong2);
        System.out.println(iniInt2);
        System.out.println(iniShort2);

    }
}
