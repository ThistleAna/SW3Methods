// overload the method with different data types
public class numberMethod {
    static int sumNum (int x, int y) { // get whole numbers
        return x+y; // use return keyword, specify the datatype on method header
    }

    static double sumNum (double x, double y) { // get decimal  numbers
        return x+y;
    }

    public static void main(String[] args) {
        // print here, not on the method
        System.out.println(sumNum(4, 6)); // pass on int numbers
        System.out.println(sumNum (15, 89));
        System.out.println(sumNum(12.4 , 34.6)); // pass on decimal number
        System.out.println(sumNum(90.5, 76.5));

        int sumIntNum = sumNum(23,7);
        System.out.println(sumIntNum);

    }

}
