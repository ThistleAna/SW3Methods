// Workbook 3 Method, number 7
public class AgeChecker {
    // create method to check age of the player
    // pass on age, no return value, use if-else to check the age
    static void checkAge(int age){
        //check the age
        if (age >= 18) {
            System.out.println("Access  granted!");
        } else {
            System.out.println("Access denied :(");
        }
    }

    //create main method
    //call checkAge() method, pass on different age values: 20, 18, 12
    public static void main(String[] args) {
        checkAge(20); // granted
        checkAge(18); // granted
        checkAge(12); // denied
    }
}
