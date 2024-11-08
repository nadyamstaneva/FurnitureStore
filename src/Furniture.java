import java.util.List;

public class Furniture {
    private long id;
    private String name;
    private double price;
    private double priceOfCreation;
    private Category category;
    private List<MaterialsInFurniture> materialsInFurnitureList;

    public Furniture(long id, String name, double price, double priceOfCreation, Category category, List<MaterialsInFurniture> materialsInFurnitureList) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.priceOfCreation = priceOfCreation;
        this.category = category;
        this.materialsInFurnitureList = materialsInFurnitureList;
    }

    public Furniture() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPriceOfCreation() {
        return priceOfCreation;
    }

    public void setPriceOfCreation(double priceOfCreation) {
        this.priceOfCreation = priceOfCreation;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<MaterialsInFurniture> getMaterialsInFurnitureList() {
        return materialsInFurnitureList;
    }

    public void setMaterialsInFurnitureList(List<MaterialsInFurniture> materialsInFurnitureList) {
        this.materialsInFurnitureList = materialsInFurnitureList;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", priceOfCreation=" + priceOfCreation +
                ", category=" + category +
                ", materialsInFurnitureList=" + materialsInFurnitureList +
                '}';
    }
}
