/*
   Welcome to assignment eight, where you will practice
   using abstract classes and interfaces to enhance the pizzeria app
   that we worked on last time.

   ------------------------------------------------------------
   Abstract class
   -------------------------------------------------------------
   ...

   ------------------------------------------------------------
   Interface
   -------------------------------------------------------------
    ...

   In this exercise, you will practice using Abstract classes and Interfaces
   to make pizzas modifiable and resizable.
   Scroll down to STEP 1:
   */

/**
 * This is the Main method,
 * Uncomment the lines of code for each method you implement
 * to test your solution.
 */

public class AbstractPractice {
    public static void main(String[] args) {
        AbstractPractice op = new AbstractPractice();
        System.out.println("Task 1: ");
        System.out.println("Task 2: ");
        System.out.println("Task 3: ");
        System.out.println("Task 4: ");
        System.out.println("Task 5: ");

        // 1 Make Menu Item Abstract class make Pizza and Durum extend it
        Pizza pizza1 = new Pizza("Margherita");
        Durum durum1 = new Durum("Classic", "kebab");
        System.out.println(pizza1.getPrice());
        System.out.println(durum1.getPrice());

        // step 2 make Resizable interface, make Pizza implement it, add price and size to String
        Pizza pizza = new Pizza("Hawaii");
        System.out.println(pizza.toString());
        pizza.makeLarge();
        System.out.println(pizza.toString());

        // step 3 make Durum Resizeable, add price to and size to string method
        Durum durum = new Durum("Vegetarian", "soy");
        System.out.println(durum.toString());
        durum.makeLarge();
        System.out.println(durum.toString());

        // step 4 Make pizza Modifyable, condition not even needed
        Pizza pizza2 = new Pizza("Greek");
        System.out.println(pizza2.toString());
        pizza2.addIngredient("chilli");
        System.out.println(pizza2.toString());
        pizza2.removeIngredient("chi");
        System.out.println(pizza2.toString());

        // step 5 make add ingredient set price up, remove ingredient set price down
        // careful in TESTING!!!
        OrderManager orderManager = new OrderManager();
        Pizza pizza3 = new Pizza("Vesuvius");
        pizza3.addIngredient("olives");
        Pizza pizza4 = new Pizza("Diablo");
        pizza4.addIngredient("bacon");
        pizza4.removeIngredient("cheese");
        orderManager.addMenuItem(pizza3);
        orderManager.addMenuItem(pizza4);
        System.out.println(orderManager.calculateTotalPrice());
    }

    /**
     * Task 1
     * In this task we will create the  MenuItem class (see the UML diagram for reference)
     * The MenuItem class will be slightly different from last time,
     * it needs to have only one private attribute price(double).
     * The class also needs a constructor that uses a double price parameter.
     * This price attribute needs a getter method.
     * The class also needs a toString method for
     * displaying the MenuItems nicely for testing your solution.
     * You can choose a format you like, or you can use this one:
     * return " price: "+ getPrice();
     * Note! The toString() method must return a String, not just System.out.print it
     * Points: 2
     * New skills: revision attributes and constructors
     * Difficulty: 2
     */

    public void getMenuItemInfo() {

    }

    /**
     * Task 2
     * Our pizzeria will be making two types of MenuItems,
     * pizzas and durum, for this we will need to create
     * two classes Pizza and Durum, they will be much like
     * in the previous task, but a bit modified.
     * Pizza and Durum classes must be implemented as children classes
     * to the MenuItem parent class.
     * Use the UML diagram provided in the UML folder to see pizza and durum attributes.
     * Remember to make all attributes private and create getters.
     * Create the constructors, as instructed.
     * Since, Pizza and Durum classes have an inheritance relation to MenuItem class,
     * they will need to send the price parameter to the super class in the constructor.
     * All pizzas cost 87.0 and all durum cost 65.0
     * For simplicity, all pizzas have the following ingredients {"crust","cheese","toppings"}.
     * You also need to create a toStringMethod, to print out your items nicely.
     * You can use the previous Task_6_Inheritance_And_Overriding as an example
     * Points: 2
     * New skills: repetition of inheritance
     * Difficulty: 2
     */


    public void makePizzaAndDurum() {

    }

    /**
     * Task 3
     * In this step we will create an OrderManager class,
     * with one private attribute, which is an ArrayList of MenuItems.
     * Using this data structure instead of an array, like we did last
     * time, will make it easier to add and remove items from the list,
     * because ArrayLists have a dynamically changing size, and some
     * useful methods, such as add and remove are pre-implemented.
     * Try to use the .add method to implement the addMenuItem method
     * You can find an example here:
     * "Introduction to Java Programming and Data Structures book"
     * Inheritance and Polymorphism, Listing 11.8 TestArrayList.java
     * You will also need to create an empty constructor a getter and a toString method.
     * See the UML diagram for more details.
     * Points: 3
     * New skills: polymorphism and ArrayList<>
     * Difficulty: 3
     */
    public void checkOrderManager() {
        // Task 3

    }


    /**
     * Task 4
     * In this task we will learn to use polymorphism to check
     * if a MenuItem in the menuItems ArrayList<> is a
     * Pizza or a Durum class object. We will use overloading,
     * to implement calculating the discount price, like we did in
     * Task_5_Visibility_And_Overloading
     * Implement the calculateTotalPrice(double durumDiscount)
     * in a way that it would iterate through all items in the
     * menuItems ArrayList<> using a for or a for each loop,
     * and sum them up to a total price.
     * Check for each item if it is a Durum, if so
     * subtract the discount from total price.
     * Points: 3
     * New skills: polymorphism and instanceof
     * Difficulty: 4
     */

    public void checkDurumDiscount() {

    }


    /**
     * Task 5
     * Finally, we will add additional functionality to OrderManager
     * calculateTotalPrice() method.
     * The pizzas in out system now have a size attribute,
     * which can be "regular" or "family"
     * Add additional functionality to the method,
     * so that while it is looping through the menuItems
     * to calculate the total price it also checks if the
     * menu item is a Pizza. If so the item gets casted to
     * a Pizza object to check the type attribute.
     * If the type is "family" extra 100.0 is added to total price.
     * Hint! Use the exact String "family" as size for the tests to pass
     * Points: 2
     * New skills: polymorphism and casting objects
     * Difficulty: 2
     */

    public void checkTotalPriceWithFamilyPizza() {

    }
}
/**
 * @author Maria Hansen
 */