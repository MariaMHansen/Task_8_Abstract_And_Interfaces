import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.*;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.fail;

class AbstractPracticeTest {
    AbstractPracticeTest() {
    }

    // Step 1 Test
    @DisplayName("Checks MenuItem abstract class")
    @Test
    void menuItemClassTest() throws ClassNotFoundException, NoSuchMethodException, NoSuchFieldException, InvocationTargetException, InstantiationException, IllegalAccessException {

        // Checking if MenuItem class exists
        if (!classExists("MenuItem")) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 1:\n" +
                    " You need to create the MenuItem class to pass Test 1 \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }

        // Checking if MenuItem price attribute exists
        if (!fieldExists("MenuItem", "price")) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 1:\n" +
                    " You need to create the MenuItem price attribute to pass Test 1 \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        // Checking if MenuItem is an abstract class
        Class<?> MenuItemClass = Class.forName("MenuItem");
        if (!Modifier.isAbstract(MenuItemClass.getModifiers())) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 1:\n" +
                    " The MenuItem class must be abstract, check the task description. \n" +
                    "          You can find examples of abstract classes here: \n" +
                    "          \"Introduction to Java Programming and Data Structures book\"\n" +
                    "          13.2 Abstract Classes \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        // Checking if Pizza class extends MenuItem
        Class<?> pClass = Class.forName("Pizza");
        Class<?> mClass = Class.forName("MenuItem");
        if (!mClass.isAssignableFrom(pClass)) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "Step 2:\n" +
                    " Pizza has to be a child class to MenuItem to pass Test 2 \n" +
                    "          Try using extends keyword in the child class \n" +
                    "          If you are having problems with the constructor \n" +
                    "          Try super keyword, it MUST be in the first line of constructor! \n" +
                    "          You can find examples of inheritance here: \n" +
                    "          \"Introduction to Java Programming and Data Structures book\"\n" +
                    "          11.2 Superclasses and Subclasses \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        // class exists
        Assertions.assertEquals(true, classExists("MenuItem"));
        // class is abstract
        Assertions.assertEquals(true, Modifier.isAbstract(MenuItemClass.getModifiers()));
        // Pizza class extends abstract
        Assertions.assertEquals(true, mClass.isAssignableFrom(pClass));
        // price field exists
        Assertions.assertEquals(true, fieldExists("MenuItem", "price"));

    }


    // Test 2
    @DisplayName("Checks Resizable interface Pizza methods")
    @Test
    void resizableInterfaceTest() throws ClassNotFoundException, NoSuchMethodException, NoSuchFieldException, InvocationTargetException, InstantiationException, IllegalAccessException {

        // Checking if Resizable class exists
        if (!classExists("Resizable")) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 2:\n" +
                    " You need to create the Resizable interface to pass Test 2 \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        Class<?> ResizableClass = Class.forName("Resizable");
        // Checking if Resizable is an interface
        if (!ResizableClass.isInterface()) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 2:\n" +
                    " Resizable has to be an interface to pass Test 2 \n" +
                    "          You can find examples of interfaces in the book: \n" +
                    "          \"Introduction to Java Programming and Data Structures book\"\n" +
                    "           13.5 Interfaces \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        Class<?> PizzaClass = Class.forName("Pizza");
        // Checking if Pizza implements Resizable interface
        if (!ResizableClass.isAssignableFrom(PizzaClass)) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 2:\n" +
                    " Pizza class has to implement Resizable interface to pass test 2 \n" +
                    "          It is very similar to implementing inheritance, \n" +
                    "          Try using implements keyword in Pizza class\n" +
                    "          You can find examples of interfaces in the book: \n" +
                    "          \"Introduction to Java Programming and Data Structures book\"\n" +
                    "           13.5 Interfaces \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }

        // interface exists
        Assertions.assertEquals(true, classExists("Resizable"));
        // class is an interface
        Assertions.assertEquals(true, ResizableClass.isInterface());
        // checks if Pizza implements Resizable interface
        Assertions.assertEquals(true, ResizableClass.isAssignableFrom(PizzaClass));
        // make a pizza and make it large and get size
        Assertions.assertEquals(true, pizzaSizeChangeChecker());
    }


    // Task 3 Test
    @DisplayName("Checks Resizable interface Durum methods")
    @Test
    void orderTest() throws ClassNotFoundException, NoSuchMethodException, NoSuchFieldException, InvocationTargetException, InstantiationException, IllegalAccessException {

        // Checking if Resizable class exists
        if (!classExists("Resizable")) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 3:\n" +
                    " You need to create the Resizable interface to pass Test 3 \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        Class<?> ResizableClass = Class.forName("Resizable");
        // Checking if Resizable is an interface
        if (!ResizableClass.isInterface()) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 3:\n" +
                    " Resizable has to be an interface to pass Test 3 \n" +
                    "          You can find examples of interfaces in the book: \n" +
                    "          \"Introduction to Java Programming and Data Structures book\"\n" +
                    "           13.5 Interfaces \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        Class<?> DurumClass = Class.forName("Durum");
        // Checking if Durum implements Resizable interface
        if (!ResizableClass.isAssignableFrom(DurumClass)) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 3:\n" +
                    " Durum class has to implement Resizable interface to pass test 3 \n" +
                    "          It is very similar to implementing inheritance, \n" +
                    "          Try using implements keyword in Durum class\n" +
                    "          You can find examples of interfaces in the book: \n" +
                    "          \"Introduction to Java Programming and Data Structures book\"\n" +
                    "           13.5 Interfaces \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }

        // interface exists
        Assertions.assertEquals(true, classExists("Resizable"));
        // checks if Durum implements Resizable interface
        Assertions.assertEquals(true, ResizableClass.isAssignableFrom(DurumClass));
        // make a durum and make it large and get size
        Assertions.assertEquals(true, durumSizeChangeChecker());
    }

    // Task 4 Test
    @DisplayName("Checks Modifiable interface functionality")
    @Test
    void modifiableInterfaceTest() throws ClassNotFoundException, NoSuchMethodException, NoSuchFieldException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // Checking if Resizable class exists
        if (!classExists("Modifiable")) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 4:\n" +
                    " You need to create the Modifiable interface to pass Test 4 \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        Class<?> ModifiableClass = Class.forName("Modifiable");
        // Checking if Modifiable is an interface
        if (!ModifiableClass.isInterface()) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 4:\n" +
                    " Modifiable has to be an interface to pass Test 4 \n" +
                    "          You can find examples of interfaces in the book: \n" +
                    "          \"Introduction to Java Programming and Data Structures book\"\n" +
                    "           13.5 Interfaces \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        Class<?> PizzaClass = Class.forName("Pizza");
        // Checking if Pizza implements Modifiable interface
        if (!ModifiableClass.isAssignableFrom(PizzaClass)) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 4:\n" +
                    " Pizza class has to implement Modifiable interface to pass test 4 \n" +
                    "          It is very similar to implementing inheritance, \n" +
                    "          Try using implements keyword in Pizza class\n" +
                    "          You can find examples of interfaces in the book: \n" +
                    "          \"Introduction to Java Programming and Data Structures book\"\n" +
                    "           13.5 Interfaces \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }

        // interface exists
        Assertions.assertEquals(true, classExists("Modifiable"));
        // class is an interface
        Assertions.assertEquals(true, ModifiableClass.isInterface());
        // checks if Pizza implements Resizable interface
        Assertions.assertEquals(true, ModifiableClass.isAssignableFrom(PizzaClass));
        // make a pizza add an ingredient check ingredients
        Assertions.assertEquals(true, pizzaAddIngredientsChecker());
        // make a pizza remove an ingredient check ingredients
        Assertions.assertEquals(true, pizzaRemoveIngredientsChecker());
    }

    // Task 5 Test
    @DisplayName("Checks if totalPrice is affected by pizza modifications")
    @Test
    void orderManagerTotalPriceTest() throws ClassNotFoundException, NoSuchMethodException, NoSuchFieldException, InvocationTargetException, InstantiationException, IllegalAccessException {

        // Checking if OrderManager class exists
        if (!classExists("OrderManager")) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 5:\n" +
                    " You need to create the OrderManager class to pass Test 5 \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        if (callCalculateTotalPriceMethod() == 0.0) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 5:\n" +
                    " Looks like your calculateTotalPrice method does not add prices up \n" +
                    " it returns a zero. There are several things you can check.\n" +
                    " The ++ operator adding prices up must be inside the loop\n" +
                    " Use menuItem.getPrice to access the price for each item\n" +
                    " Make a loop to iterate through the menuItems ArrayList in Order class\n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        if (callCalculateTotalPriceMethod() == 87.0) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 5:\n" +
                    " Looks like your calculateTotalPrice method does not add 5.0 \n" +
                    " to the bill when a new ingredient is added. \n" +
                    " Try using super keyword to access the price\n" +
                    " for a MenuItem on the menuItems ArrayList\n" +
                    " First use the getter to get it, then add 5 and use the setter to set it\n" +
                    "-------------------------------------------------------------------------\n"
            );
        }

        // checking if total price takes account for adding ingredients
        Assertions.assertEquals(92.0, callCalculateTotalPriceMethod());
        // checking if total price takes account for removing ingredients
        Assertions.assertEquals(82.0, callCalculateTotalPriceMethodIngredientRemoved());
    }

    public boolean classExists(String className) {
        try {
            Class.forName(className);
            return true;
        } catch (ClassNotFoundException exception) {
            return false;
        }
    }

    public boolean fieldExists(String className, String fieldName) {
        try {
            Class<?> TempClass = Class.forName(className);
            Field field = TempClass.getDeclaredField(fieldName);
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        } catch (NoSuchFieldException e) {
            return false;
        }
    }

    private boolean pizzaAddIngredientsChecker() throws ClassNotFoundException, NoSuchMethodException, InstantiationException {
        String itemAdded = "";
        try {
            // make pizza object
            Class<?> PizzaClass = Class.forName("Pizza");
            Object pizzaObject = createPizzaTestObject();


            // Get the addIngredient Method
            Method addIngredientMethod = PizzaClass.getMethod("addIngredient", String.class);

            // Invoke the addIngredient method
            String[] attributes = new String[1];
            attributes[0] = "tomatoes";
            addIngredientMethod.invoke(pizzaObject, attributes);

            // get ingredients field from pizza
            Field pizzaIngredientsField = PizzaClass.getDeclaredField("ingredients");
            pizzaIngredientsField.setAccessible(true);
            Object value = pizzaIngredientsField.get(pizzaObject);
            ArrayList<Object> results = (ArrayList<Object>) value;
            itemAdded = (String) results.get(results.size() - 1);

        } catch (IllegalAccessException e) {

        } catch (InvocationTargetException e) {

        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }

        return (itemAdded.equals("tomatoes"));
    }

    private boolean pizzaRemoveIngredientsChecker() throws ClassNotFoundException, NoSuchMethodException, InstantiationException {
        String lastItem = "";
        try {
            // make pizza object
            Class<?> PizzaClass = Class.forName("Pizza");
            Object pizzaObject = createPizzaTestObject();


            // Get the removeIngredient Method
            Method removeIngredientMethod = PizzaClass.getMethod("removeIngredient", String.class);

            // Invoke the addIngredient method
            String[] attributes = new String[1];
            attributes[0] = "toppings";
            removeIngredientMethod.invoke(pizzaObject, attributes);

            // get ingredients field from pizza
            Field pizzaIngredientsField = PizzaClass.getDeclaredField("ingredients");
            pizzaIngredientsField.setAccessible(true);
            Object value = pizzaIngredientsField.get(pizzaObject);
            ArrayList<Object> results = (ArrayList<Object>) value;
            lastItem = (String) results.get(results.size() - 1);

        } catch (IllegalAccessException e) {

        } catch (InvocationTargetException e) {

        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }

        return (lastItem.equals("cheese"));
    }

    private boolean pizzaSizeChangeChecker() throws ClassNotFoundException, NoSuchMethodException, InstantiationException {
        String sizeBefore = "";
        String sizeAfter = "";
        boolean pizzaSizeChanged = false;
        try {
            // make pizza object
            Class<?> PizzaClass = Class.forName("Pizza");
            Object pizzaObject = createPizzaTestObject();

            // get size field from pizza
            Field pizzaSizeField = PizzaClass.getDeclaredField("size");
            pizzaSizeField.setAccessible(true);

            // get size field value from pizza
            Object value = pizzaSizeField.get(pizzaObject);
            sizeBefore = (String) value;

            // Get the makeLarge Method
            Method makeLargeMethod = PizzaClass.getMethod("makeLarge");

            // Invoke the makeLarge method
            makeLargeMethod.invoke(pizzaObject);

            // get size field value from pizza after the method was called
            Object valueAfter = pizzaSizeField.get(pizzaObject);
            sizeAfter = (String) valueAfter;

        } catch (IllegalAccessException e) {

        } catch (InvocationTargetException e) {

        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }

        return (sizeBefore.equals("regular") && sizeAfter.equals("family"));
    }

    private boolean durumSizeChangeChecker() throws ClassNotFoundException, NoSuchMethodException, InstantiationException {
        String sizeBefore = "";
        String sizeAfter = "";
        boolean durumSizeChanged = false;
        try {
            // make durum object
            Class<?> DurumClass = Class.forName("Durum");
            Object durumObject = createDurumTestObject();

            // get size field from durum
            Field durumSizeField = DurumClass.getDeclaredField("size");
            durumSizeField.setAccessible(true);

            // get size field value from durum
            Object value = durumSizeField.get(durumObject);
            sizeBefore = (String) value;

            // Get the makeLarge Method
            Method makeLargeMethod = DurumClass.getMethod("makeLarge");

            // Invoke the makeLarge method
            makeLargeMethod.invoke(durumObject);

            // get size field value from pizza after the method was called
            Object valueAfter = durumSizeField.get(durumObject);
            sizeAfter = (String) valueAfter;

        } catch (IllegalAccessException e) {

        } catch (InvocationTargetException e) {

        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }

        return (sizeBefore.equals("regular") && sizeAfter.equals("large"));
    }

    private Object createPizzaTestObject() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // If Pizza class exists check if the name attribute is a String
        Class<?> TempClass = Class.forName("Pizza");
        // getting Pizza class constructor
        Constructor<?> constructor = TempClass.getConstructor(String.class);
        // Object array for the constructor attributes
        Object[] arguments = new Object[1];
        arguments[0] = "PizzaTestName";
        // Instantiating Pizza object
        Object instance = constructor.newInstance(arguments);
        return instance;
    }

    private Object createDurumTestObject() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> TempClass = Class.forName("Durum");
        // getting Pizza class constructor
        Constructor<?> constructor = TempClass.getConstructor(String.class, String.class);
        // Object array for the constructor attributes
        Object[] arguments = new Object[2];
        arguments[0] = "classic durum";
        arguments[1] = "kebab";
        Object instance = constructor.newInstance(arguments);
        return instance;
    }

    private boolean callMenuItemAddMethodWithPizza() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        boolean menuItemAdded = false;
        try {
            // Making a new order object
            Class<?> OrderManagerClass = Class.forName("OrderManager");
            Constructor<?> constructor = OrderManagerClass.getConstructor();
            Object orderObject = constructor.newInstance();

            // Making a new MenuItem object
            Class<?> MenuItemClass = Class.forName("MenuItem");
            Method addMenuItemMethod = OrderManagerClass.getMethod("addMenuItem", MenuItemClass);

            // Making a pizza instance to invoke method with
            Class<?> PizzaClass = Class.forName("Pizza");
            Constructor<?> pizzaConstructor = PizzaClass.getConstructor(String.class, String.class);
            // Object array for the constructor attributes
            Object[] arguments = new Object[2];
            arguments[0] = "TestName";
            arguments[1] = "TestSize";
            // Instantiating Pizza object
            Object pizzaObject = pizzaConstructor.newInstance(arguments);

            // Make order menuItems field accessible
            Field orderMenuItemsField = OrderManagerClass.getDeclaredField("menuItems");
            orderMenuItemsField.setAccessible(true);

            // Invoke the method
            Object result = addMenuItemMethod.invoke(orderObject, pizzaObject);
            Object chArray = orderMenuItemsField.get(orderObject);
            menuItemAdded = (!chArray.toString().isEmpty());


        } catch (IllegalAccessException e) {

        } catch (InvocationTargetException e) {

        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }

        return menuItemAdded;
    }

    private double callCalculateTotalPriceMethod() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        double totalPrice = 0.0;
        try {
            // Making a new OrderManager object
            Class<?> OrderManagerClass = Class.forName("OrderManager");
            Constructor<?> constructor = OrderManagerClass.getConstructor();
            Object orderManagerObject = constructor.newInstance();

            // Accessing the calculate total price method
            Method calculateTotalPriceMethod = OrderManagerClass.getMethod("calculateTotalPrice");

            // Make OrderManager menuItems field accessible
            Field menuItemsField = OrderManagerClass.getDeclaredField("menuItems");
            menuItemsField.setAccessible(true);

            // Getting the addMenuItemMethod
            Class<?> MenuItemClass = Class.forName("MenuItem");
            Method addMenuItemMethod = OrderManagerClass.getMethod("addMenuItem", MenuItemClass);

            // Making a pizza instance
            Class<?> PizzaClass = Class.forName("Pizza");
            Object pizzaObject = createPizzaTestObject();

            // Getting the addIngredientMethod
            Method addIngredientMethod = PizzaClass.getMethod("addIngredient", String.class);

            // Invoking addIngredient with a pizza object and a String
            String[] attributes = new String[1];
            attributes[0] = "tomatoes";
            addIngredientMethod.invoke(pizzaObject, attributes);

            // Invoke the addPizza method to add it to the order
            addMenuItemMethod.invoke(orderManagerObject, pizzaObject);

            // Invoke the calculateTotalPrice method
            Object result = calculateTotalPriceMethod.invoke(orderManagerObject);
            totalPrice = (double) result;

        } catch (IllegalAccessException e) {

        } catch (InvocationTargetException e) {

        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }

        return totalPrice;
    }

    private double callCalculateTotalPriceMethodIngredientRemoved() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        double totalPrice = 0.0;
        try {
            // Making a new OrderManager object
            Class<?> OrderManagerClass = Class.forName("OrderManager");
            Constructor<?> constructor = OrderManagerClass.getConstructor();
            Object orderManagerObject = constructor.newInstance();

            // Accessing the calculate total price method
            Method calculateTotalPriceMethod = OrderManagerClass.getMethod("calculateTotalPrice");

            // Make OrderManager menuItems field accessible
            Field menuItemsField = OrderManagerClass.getDeclaredField("menuItems");
            menuItemsField.setAccessible(true);

            // Getting the addMenuItemMethod
            Class<?> MenuItemClass = Class.forName("MenuItem");
            Method addMenuItemMethod = OrderManagerClass.getMethod("addMenuItem", MenuItemClass);

            // Making a pizza instance
            Class<?> PizzaClass = Class.forName("Pizza");
            Object pizzaObject = createPizzaTestObject();

            // Getting the removeIngredientMethod
            Method removeIngredientMethod = PizzaClass.getMethod("removeIngredient", String.class);

            // Invoking addIngredient with a pizza object and a String
            String[] attributes = new String[1];
            attributes[0] = "toppings";
            removeIngredientMethod.invoke(pizzaObject, attributes);

            // Invoke the addPizza method to add it to the order
            addMenuItemMethod.invoke(orderManagerObject, pizzaObject);

            // Invoke the calculateTotalPrice method
            Object result = calculateTotalPriceMethod.invoke(orderManagerObject);
            totalPrice = (double) result;

        } catch (IllegalAccessException e) {

        } catch (InvocationTargetException e) {

        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }

        return totalPrice;
    }
}
/**
 * @author Maria Hansen
 */