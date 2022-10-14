package OOPWithNLayeredApp.entities;

public class Product {
    private int id;
    private String name;
    private int unitePrice;

    public Product() {

    }

    public Product(int id, String name, int unitePrice) {
        this.id = id;
        this.name = name;
        this.unitePrice = unitePrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUnitePrice() {
        return unitePrice;
    }

    public void setUnitePrice(int unitePrice) {
        this.unitePrice = unitePrice;
    }
}
