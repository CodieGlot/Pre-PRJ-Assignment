import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FacilityService extends RepositoryBase<FacilityEntity> {
    @Override
    protected String tableName = "Facilities";

    @Override
    protected FacilityEntity createEntityFromResultSet(ResultSet rs) throws SQLException {
        return new FacilityEntity(rs);
    }

    public List<Facility> getAllFacilities() {
        List<Facility> facilities = new ArrayList<>();

        String sql = "SELECT * FROM Facilities;";

        try (Connection conn = new DBContext().getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                FacilityEntity entity = new FacilityEntity(rs);
                facilities.add(mapEntityToFacility(entity));
            }

        } catch (Exception e) {
            // Handle the exception appropriately, log or rethrow if necessary
            System.err.println("Error retrieving facilities: " + e.getMessage());
        }

        return facilities;
    }

    public Facility getFacilityById(String id) {
        FacilityEntity entity = null;

        String sql = "SELECT TOP 1 * FROM Facilities WHERE Id = ?;";

        try (Connection conn = new DBContext().getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ps.setString(1, id);
             ResultSet rs = ps.executeQuery()) {

            entity = new FacilityEntity(rs);  
        } catch (Exception e) {
            // Handle the exception appropriately, log or rethrow if necessary
            System.err.println("Error retrieving facilities: " + e.getMessage());
        }

        return mapEntityToFacility(entity, true);
    }

    private Facility mapEntityToFacility(FacilityEntity entity, boolean getDetails = false) {
        Facility facility = new Facility();
        
        if (entity != null) {
            facility.setId(entity.getId());
            facility.setName(entity.getName());
            facility.setArea(entity.getArea());
            facility.setRentalCost(entity.getRentalCost());
            facility.setMaxOccupancy(entity.getMaxOccupancy());
            facility.setRentType(entity.getRentType());
            facility.setFacilityType(FacilityType.fromIndex(entity.getFacilityType()));

            if (getDetails) {
                switch (facility.getFacilityType()) {
                    case FacilityType.Villa:
                        facility.setVilla();
                        break;
                    case FacilityType.House:
                        facility.setHouse();
                        break;
                    case FacilityType.Room:
                        facility.setRoom();
                        break;
                }
            }
        }

        return facility;
    }

    private Villa mapVillaEntityToVilla(VillaEntity villaEntity) {
        // Implement mapping logic from VillaEntity to Villa
        // ...

        return new Villa(); // Placeholder, replace with actual implementation
    }

    private House mapHouseEntityToHouse(HouseEntity houseEntity) {
        // Implement mapping logic from HouseEntity to House
        // ...

        return new House(); // Placeholder, replace with actual implementation
    }

    private Room mapRoomEntityToRoom(RoomEntity roomEntity) {
        // Implement mapping logic from RoomEntity to Room
        // ...

        return new Room(); // Placeholder, replace with actual implementation
    }
}
