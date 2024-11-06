import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private long id;
    private double totalPrice;
    private Date dateOfOrder;
    private Date deliveryPrice;
    private Status status;
    private Client client;
    List<FurnituresInOrder> furnituresInOrder;

    public Order(long id, double totalPrice, Date dateOfOrder, Date deliveryPrice, Status status, Client client, List<FurnituresInOrder> furnituresInOrder) {
        this.id = id;
        this.totalPrice = totalPrice;
        this.dateOfOrder = dateOfOrder;
        this.deliveryPrice = deliveryPrice;
        this.status = status;
        this.client = client;
        this.furnituresInOrder = furnituresInOrder;
    }

    public Order() {
        this.status = Status.NEW;
        this.client = new Client();
        this.furnituresInOrder = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getDateOfOrder() {
        return dateOfOrder;
    }

    public void setDateOfOrder(Date dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }

    public Date getDeliveryPrice() {
        return deliveryPrice;
    }

    public void setDeliveryPrice(Date deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<FurnituresInOrder> getFurnituresInOrder() {
        return furnituresInOrder;
    }

    public void setFurnituresInOrder(List<FurnituresInOrder> furnituresInOrder) {
        this.furnituresInOrder = furnituresInOrder;
    }

    @Override
    public String toString() {
        return "Order{" +
                "totalPrice=" + totalPrice +
                ", dateOfOrder=" + dateOfOrder +
                ", deliveryPrice=" + deliveryPrice +
                ", status=" + status +
                ", client=" + client +
                ", furnituresInOrder=" + furnituresInOrder +
                '}';
    }
}
