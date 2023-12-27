import java.sql.ResultSet;
import java.sql.SQLException;

public class HouseEntity {
    private String id;
    private String standardRoom;
    private int floors;

    public HouseEntity(ResultSet rs) throws SQLException {
        this.id = rs.getString("Id");
        this.standardRoom = rs.getString("StandardRoom");
        this.floors = rs.getInt("Floors");
    }

    // Getter methods
    public String getId() {
        return id;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public int getFloors() {
        return floors;
    }

    // Setter methods (if needed)

    // Other methods
}
