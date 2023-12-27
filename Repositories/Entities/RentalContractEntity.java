import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RentalContractEntity {
    private int id;
    private int bookingId;
    private BigDecimal deposit;
    private BigDecimal totalAmount;

    public RentalContractEntity(ResultSet rs) throws SQLException {
        this.id = rs.getInt("Id");
        this.bookingId = rs.getInt("BookingId");
        this.deposit = rs.getBigDecimal("Deposit");
        this.totalAmount = rs.getBigDecimal("TotalAmount");
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public int getBookingId() {
        return bookingId;
    }

    public BigDecimal getDeposit() {
        return deposit;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    // Setter methods (if needed)

    // Other methods
}
