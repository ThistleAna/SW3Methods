// return value instead of void
public class Example3 {
    static int myCalculator(int x) { // the return value is integer, declare it on the header
        return 5+x;
    }

    static int mySubs(int x, int y){
        return x-y;
    }

    public static void main(String[] args) {
        System.out.println(myCalculator(4)); // OUTPUT = 5+4 = 9
        System.out.println(mySubs(10,8));  // OUTPUT = 2
    }
}
