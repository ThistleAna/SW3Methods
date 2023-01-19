//method overloading
// copy this template to your own java file, do not modify this file please

public class nameOverloading {

    public static void main(String[] args) { //main method
        myMethod();
        myMethod("Harry"); // pass on the arguments
        myMethod("Lilly");
        myMethod("Draco", "Lucius", "Malfoy");
        myMethod ("Harmony", "Grainger");
    }


    public static void myMethod(){
        System.out.println("Any name is a good name.");
    }

    public static void myMethod(String fName){ //1 parameter passing
        System.out.println(fName + " Potter");
    }

    // create a method, pass on fName and lName only
    // from main, call the method and put any name with 2 syllables

    public static void myMethod (String fName, String lName){
        System.out.println(fName + " " + lName);
    }

    public static void myMethod(String fName, String mName, String lName) {// 3 parameters passing
        System.out.println(fName + " " + mName + " " + lName);
    }

}
