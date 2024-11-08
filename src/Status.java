public enum Status {
    NEW(1), IN_PROCESS(2), SENT(3), DELIVERED(4);

    private int id;

    Status(int id) {
        this.id = id;
    }

    int getId() {
        return id;
    }
}
