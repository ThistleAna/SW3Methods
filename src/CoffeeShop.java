public class CoffeeShop {
    // Your exercise to create a method called coffee()
    // pass on two parameters, orderName and price
    // on you main method, pass on these orders (arguments)
    // Cappuccino, 4.5
    // Mocha, 3.5
    // Flat White, 4.0

    //main method here
    public static void main(String[] args) {
        // call new method and passing arguments
        coffee("Cappuccino", 4.5);
        coffee("Mocha", 3.5);
        coffee("Flat White", 4.0);

    }

    // coffee method here
    public static void coffee(String orderName, double price){
        System.out.println("You've ordered " + orderName + ", the price is £ " + price);
    }

}
