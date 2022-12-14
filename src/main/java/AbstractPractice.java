/*
   Welcome to assignment eight, where you will practice
   using abstract classes and interfaces to enhance the pizzeria app
   that we worked on last time.

   ------------------------------------------------------------
   Abstract class
   -------------------------------------------------------------
   An abstract class in Java is used to define the generalised description of
   what all classes of a certain type must be able to do. For example,
   if a vehicle is an abstract class with drive(), brake() and stop()
   methods, that all types of car classes that extend the vehicle class,
   must also implement these methods to be a real vehicle.

   ------------------------------------------------------------
   Interface
   -------------------------------------------------------------
   An interface in programming is like a contract. Any class that implements
   the interface is guaranteed to implement the methods declared in the
   interface. That is very convenient when a developer team members are working
   on different classes, that must all have a set of key methods for the program to work.

   In this exercise, you will practice using Abstract classes and Interfaces
   to make pizzas modifiable and resizable.
   Scroll down to STEP 1:
   */

/**
 * This is the Main method,
 * Uncomment the lines of code for each method you implement
 * to test your solution.
 * Note: In this assignment some classes are pre-implemented for you!
 */

public class AbstractPractice {
    public static void main(String[] args) {
        AbstractPractice op = new AbstractPractice();
        System.out.println("Task 1: "); op.getMenuItemInfo();
        System.out.println("Task 2: "); op.resizePizza();
        System.out.println("Task 3: "); op.resizeDurum();
        System.out.println("Task 4: "); op.modifyPizza();
        System.out.println("Task 5: "); op.checkTotalPrice();
    }

    /**
     * Task 1
     * In this task we will create the MenuItem abstract class (see the UML diagram for reference)
     * The MenuItem class will be slightly different from last time,
     * it needs to have only one private attribute price(double).
     * The class also needs an empty constructor that sets the default price to 0.0
     * This price attribute needs a getter method, a setter method,
     * and a toString method for displaying the price.
     * You can choose a format you like, or you can use this one:
     * return " price: "+ getPrice();
     * You are provided 2 premade classes Pizza and Durum,
     * you need to make them extend MenuItem abstract class,
     * and make modifications necessary after that
     * (some of them will be prompted by your IDE)
     * Note: Use super.setPrice() inside the child classes constructors
     * All pizzas must cost 87.0 and all durum 65.0
     * Points: 2
     * New skills: abstract class, inheritance revision
     * Difficulty: 2
     */

    public void getMenuItemInfo() {
        Pizza pizza = new Pizza("Margherita");
        Durum durum = new Durum("Classic", "kebab");
        System.out.println("MenuItem pizza has price: "+pizza.getPrice());
        System.out.println("MenuItem durum has price: "+durum.getPrice());
    }

    /**
     * Task 2
     * Our pizzeria will be making different sizes of Pizza sizes,
     * For pizzas it is "regular" and "family"
     * It is convenient in this case, to create a Resizable interface
     * that has a method makeLarge().
     * Then, you need to make Pizza class implement
     * the Resizable interface, this will require
     * implementing the makeLarge() method inside Pizza class.
     * Make this method to function in a way that it would
     * set pizza size to "family" and pizza price to 187.0 then called
     * Note: You might have to modify the toString method to see the prices change
     * Points: 2
     * New skills: creating and implementing an interface
     * Difficulty: 3
     */

    public void resizePizza() {
        Pizza pizza = new Pizza("Hawaii");
        System.out.println("This is a regular pizza, " + "size: "+ pizza.getSize() + " price: "+pizza.getPrice());
        pizza.makeLarge();
        System.out.println("This is a family pizza, " + "size: "+ pizza.getSize() + " price: "+pizza.getPrice());
    }

    /**
     * Task 3
     * In this step we will make Durum implement the Resizable interface,
     * it is almost just like pizza, but
     * For durum the sizes are "regular" and "large"
     * The price for the large durum is 85.0
     * Note: You might have to modify the toString method to see the prices change
     * See the UML diagram for more details.
     * Points: 3
     * New skills: creating and implementing an interface
     * Difficulty: 3
     */
    public void resizeDurum() {
        Durum durum = new Durum("Vegetarian", "soy");
        System.out.println("This is a regular durum, " + "size: "+ durum.getSize() + " price: "+durum.getPrice());
        durum.makeLarge();
        System.out.println("This is a large durum, " + "size: "+ durum.getSize() + " price: "+durum.getPrice());
    }

    /**
     * Task 4
     * Our pizzaria app is getting more and more advanced,
     * now it needs the functionality that would allow
     * to add and remove extra ingredients from a pizza.
     * For this we will create a Modifiable interface.
     * This interface will only be implemented by Pizza class.
     * It will contain addIngredient(String ingredient)
     * and removeIngredient(String ingredient)  methods,
     * which will remove and add items from the Pizza ingredients
     * ArrayList. Remember to keep this attribute private
     * and use setters and getters.
     * Check the UML diagram for details.
     * Note: You might have to modify the toString method to see the pizza ingredients change
     * Points: 3
     * New skills: ArrayList remove method, interfaces
     * Difficulty: 4
     */

    public void modifyPizza() {
        Pizza pizza = new Pizza("Greek");
        System.out.println(pizza);
        pizza.addIngredient("chilli");
        System.out.println(pizza);
        pizza.removeIngredient("cheese");
        System.out.println(pizza);
    }


    /**
     * Task 5
     * Finally, for this last task we will modify the calculateTotalPrice
     * method which we worked with in previous exercises.
     * The OrderManager class is pre-implemented for you.
     * Your task is to modify the addIngredient and removeIngredient
     * methods inside Pizza class, so that every time an extra ingredient
     * is added 5.0 is added to the pizzas price.
     * Correspondingly, 5.0 is deducted from pizza object price every time
     * an ingredient is removed.
     * Hint: use super keyword to access the price in MenuItem class from Pizza class
     * Points: 2
     * New skills: setting super class attributes from child classes, interfaces
     * Difficulty: 2
     */

    public void checkTotalPrice() {
        OrderManager orderManager = new OrderManager();
        Pizza pizza3 = new Pizza("Vesuvius");
        pizza3.addIngredient("olives");
        Pizza pizza4 = new Pizza("Diablo");
        pizza4.addIngredient("bacon");
        pizza4.removeIngredient("cheese");
        orderManager.addMenuItem(pizza3);
        orderManager.addMenuItem(pizza4);
        System.out.println("The total price is: " +orderManager.calculateTotalPrice());
    }
}
/*
  @author Maria Hansen
 */