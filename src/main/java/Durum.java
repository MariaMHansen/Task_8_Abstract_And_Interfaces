public class Durum extends MenuItem implements Resizable{
    String size;
    private String name;
    private String meat;
    public Durum(String name, String meat) {
        super.price =65.0;
        this.name = name;
        this.meat = meat;
        this.size = "regular";
    }
    public String getName() {
        return name;
    }
    public String getMeat() {
        return meat;
    }

    @Override
    public String toString() {
        return super.toString() + " name: " +getName() + " size: " +getSize()+ " meat: "+ getMeat();
    }


    @Override
    public void makeLarge() {
        setSize("large");
        setPrice(85.0);
    }
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}