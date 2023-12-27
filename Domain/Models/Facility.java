import java.math.BigDecimal;

public class Facility {
    private String id;
    private String name;
    private float area;
    private BigDecimal rentalCost;
    private int maxOccupancy;
    private String rentType;
    private FacilityType facilityType;
    private Villa villa;
    private House house;
    private Room room;

    public Facility() {
    }

    // Getters

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

    public FacilityType getFacilityType() {
        return facilityType;
    }

    public Villa getVilla() {
        return villa;
    }

    public House getHouse() {
        return house;
    }

    public Room getRoom() {
        return room;
    }

    // Setters

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public void setRentalCost(BigDecimal rentalCost) {
        this.rentalCost = rentalCost;
    }

    public void setMaxOccupancy(int maxOccupancy) {
        this.maxOccupancy = maxOccupancy;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    public void setFacilityType(FacilityType facilityType) {
        this.facilityType = facilityType;
    }

    public void setVilla(Villa villa) {
        this.villa = villa;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
