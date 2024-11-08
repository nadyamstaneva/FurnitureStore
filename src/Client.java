public class Client extends User {
    private String deliveryAddress;

    public Client(long id, String name, String username, String password, String email, String phone, String deliveryAddress) {
        super(id, name, username, password, email, phone);
        this.deliveryAddress = deliveryAddress;
    }

    public Client(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
    public Client() {
        this.deliveryAddress = "";
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public String toString() {
        return "Client{" +
                "deliveryAddress='" + deliveryAddress + '\'' +
                '}';
    }
}
