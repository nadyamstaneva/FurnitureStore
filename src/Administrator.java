import java.util.Date;

public class Administrator extends User {
    private Date startDate;

    public Administrator(long id, String name, String username, String password, String email, String phone, Date startDate) {
        super(id, name, username, password, email, phone);
        this.startDate = startDate;
    }

    public Administrator(Date startDate) {
        this.startDate = startDate;
    }

    public Administrator() {
        this.startDate = new Date();
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "startDate=" + startDate +
                '}';
    }
}
