// method overloading, name your class NameOverloading
// variable = arguments = field same meaning different words
// parameter = variable you pass on when you create the method
public class Example2 {
    public static void main(String[] args) { //main method

        fName(); // passing no arguments
        fName("John"); // passing 1  arguments
        fName ("William");
        fName ("Diana", "Spencer");
        fName ("Ada", "Lovelace"); // passing 2 arguments
    }
    // methods to pass on first name
    static void fName() {
        System.out.println("Your name is Ada Lovelace");
    }
    static void fName(String firstName) { // passing fname  parameter
        System.out.println(firstName + " Smith");
    }

    static void fName (String firstName, String lastName) {// passing fname and lastname parameters
        System.out.println(firstName + " " + lastName);
    }
}
