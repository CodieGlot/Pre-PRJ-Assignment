import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FacilityEntity {
    private String id;
    private String name;
    private float area;
    private BigDecimal rentalCost;
    private int maxOccupancy;
    private String rentType;
    private int facilityType;

    public FacilityEntity(ResultSet rs) throws SQLException {
        this.id = rs.getString("Id");
        this.name = rs.getString("Name");
        this.area = rs.getFloat("Area");
        this.rentalCost = rs.getBigDecimal("RentalCost");
        this.maxOccupancy = rs.getInt("MaxOccupancy");
        this.rentType = rs.getString("RentType");
        this.facilityType = rs.getInt("FacilityType");
    }

    // Getter methods
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getArea() {
        return area;
    }

    public BigDecimal getRentalCost() {
        return rentalCost;
    }

    public int getMaxOccupancy() {
        return maxOccupancy;
    }

    public String getRentType() {
        return rentType;
    }

    public int getFacilityType() {
        return facilityType;
    }

    // Setter methods (if needed)

    // Other methods
}
