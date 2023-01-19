// Workbook 3
import java.util.Scanner;
public class myCalculator {
    // main method here
    public static void main(String[] args) {
        // read two user numbers
        Scanner obj = new Scanner(System.in);
        // ask user to enter two numbers
        System.out.println("Enter two numbers : ");
        int num1 = obj.nextInt();
        int num2 = obj.nextInt();
        // call your methods below
        int add = plus(num1, num2);
        int min = minus(num1, num2);
        int mul = multiply(num1, num2);
        int div = division(num1, num2);

        System.out.println(num1 + "+" + num2 + "=" + add);
        System.out.println(num1 + "-" + num2 + "=" + min);
        System.out.println(num1 + " x " + num2 + "=" + mul);
        System.out.println(num1 + ": " + num2 + "=" + div);

    }

    // addition method
    public static int plus (int a, int b) {
        return a + b;
    }

    // subs method
    public static int minus (int a, int b){
        return a - b;
    }

    // multiplication
    public static int multiply (int a, int b) {
        return a * b;
    }

    // division
    public static int division (int a, int b) {
        return a / b;
    }
}

// your turn: create 3 more methods, substraction, multiplication and division of two numbers
