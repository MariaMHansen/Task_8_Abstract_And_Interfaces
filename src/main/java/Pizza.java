import java.util.ArrayList;

public class Pizza extends MenuItem implements Modifiable,Resizable{
    private String name;
    private String size;
    private ArrayList<String> ingredients;


    public Pizza(String name) {
        super.price = 87.0;
        this.name = name;
        this.size = "regular";
        this.ingredients = new ArrayList<>();
        ingredients.add("crust");
        ingredients.add("cheese");
        ingredients.add("toppings");
    }


    @Override
    public void addIngredient(String ingredient) {
        ingredients.add(ingredient);
        this.setPrice(this.getPrice()+5.0);
    }

    @Override
    public void removeIngredient(String ingredient) {
        if(ingredients.contains(ingredient)) {
            // Control statement
            if(this.ingredients.contains(ingredient)){
                ingredients.remove(ingredient);
                this.setPrice(this.getPrice()- 5.0);
            }
            // needs testing for null pointers !!!
        }
    }

    @Override
    public void makeLarge() {
        this.setSize("family");
        this.setPrice(187.0);
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
