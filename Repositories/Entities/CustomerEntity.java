import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class CustomerEntity {
    private String id;
    private String fullName;
    private Date birthDate;
    private String gender;
    private String idNumber;
    private String phoneNumber;
    private String email;
    private int customerType;
    private String address;

    public CustomerEntity(ResultSet rs) throws SQLException {
        this.id = rs.getString("Id");
        this.fullName = rs.getString("FullName");
        this.birthDate = rs.getDate("BirthDate");
        this.gender = rs.getString("Gender");
        this.idNumber = rs.getString("IdNumber");
        this.phoneNumber = rs.getString("PhoneNumber");
        this.email = rs.getString("Email");
        this.customerType = rs.getInt("CustomerType");
        this.address = rs.getString("Address");
    }

    // Getter methods
    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getGender() {
        return gender;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public int getCustomerType() {
        return customerType;
    }

    public String getAddress() {
        return address;
    }

    // Setter methods (if needed)

    // Other methods
}
