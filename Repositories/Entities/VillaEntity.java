import java.sql.ResultSet;
import java.sql.SQLException;

public class VillaEntity {
    private String id;
    private String standardRoom;
    private float poolArea;
    private int floors;

    public VillaEntity(ResultSet rs) throws SQLException {
        this.id = rs.getString("Id");
        this.standardRoom = rs.getString("StandardRoom");
        this.poolArea = rs.getFloat("PoolArea");
        this.floors = rs.getInt("Floors");
    }

    // Getter methods
    public String getId() {
        return id;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public float getPoolArea() {
        return poolArea;
    }

    public int getFloors() {
        return floors;
    }

    // Setter methods (if needed)

    // Other methods
}
