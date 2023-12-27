import java.math.BigDecimal;

public class RentalContract {
    private int id;
    private Booking booking;
    private BigDecimal deposit;
    private BigDecimal totalAmount;

    public RentalContract() {
    }

    // Getters
    public int getId() {
        return id;
    }

    public Booking getBooking() {
        return booking;
    }

    public BigDecimal getDeposit() {
        return deposit;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }
}
