import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class BookingEntity {
    private int id;
    private Date bookingDate;
    private Date startDate;
    private Date endDate;
    private String customerId;
    private String facilityId;

    public BookingEntity(ResultSet rs) throws SQLException {
        this.id = rs.getInt("Id");
        this.bookingDate = rs.getDate("BookingDate");
        this.startDate = rs.getDate("StartDate");
        this.endDate = rs.getDate("EndDate");
        this.customerId = rs.getString("CustomerId");
        this.facilityId = rs.getString("FacilityId");
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getFacilityId() {
        return facilityId;
    }

    // Setter methods (if needed)

    // Other methods
}
