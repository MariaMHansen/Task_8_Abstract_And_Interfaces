import java.util.ArrayList;

public class Pizza{
    private String name;
    private String size;
    private ArrayList<String> ingredients;
    public Pizza(String name) {
        this.name = name;
        this.size = "regular";
        this.ingredients = new ArrayList<>();
        ingredients.add("crust");
        ingredients.add("cheese");
        ingredients.add("toppings");
    }

   public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString() + " name: " +getName() + " size: " +getSize()+ " ingredients: "+ getIngredients();
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }
}
