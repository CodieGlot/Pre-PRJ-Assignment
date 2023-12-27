import java.sql.ResultSet;
import java.sql.SQLException;

public class RoomEntity {
    private String id;
    private String freeService;

    public RoomEntity(ResultSet rs) throws SQLException {
        this.id = rs.getString("Id");
        this.freeService = rs.getString("FreeService");
    }

    // Getters and setters, other methods
}
