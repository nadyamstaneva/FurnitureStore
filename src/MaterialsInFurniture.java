public class MaterialsInFurniture {
    private long id;
    private int quantity;
    private Materials materials;

    public MaterialsInFurniture(long id, int quantity, Materials materials) {
        this.id = id;
        this.quantity = quantity;
        this.materials = materials;
    }

    public MaterialsInFurniture() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Materials getMaterials() {
        return materials;
    }

    public void setMaterials(Materials materials) {
        this.materials = materials;
    }

    @Override
    public String toString() {
        return "MaterialsInFurniture{" +
                "id=" + id +
                ", quantity=" + quantity +
                ", materials=" + materials +
                '}';
    }
}
