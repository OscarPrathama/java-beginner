public class TipeDataArray {
    public static void main(String[] args) {

        String[] arrayString;
        arrayString = new String[3];
        arrayString[0] = "Masgan";
        arrayString[1] = "Thama";
        arrayString[2] = "Jaya";

        // array initializer
        int[] arrayInt = new int[]{
                10, 12, 22, 31, 22
        };

        long[] arrayLong = {
                10, 22, 11, 41, 23
        };

        arrayLong[0] = 100; // change array value

        // System.out.println(arrayLong[1]);
        // System.out.println("arrayLong length = " + arrayLong.length);


        // array di dalam array
        String[][] members = {
                {"Masgan", "Thama"},
                {"David", "Beckham"},
                {"Andry", "Sevchenko"}
        };

        String[] member1 = members[0];
        System.out.println(member1[0]);
        System.out.println(members[1][0]);
        System.out.println(members[2][0]);

    }
}
