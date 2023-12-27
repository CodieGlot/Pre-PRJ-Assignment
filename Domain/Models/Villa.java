public class Villa {
    private String standardRoom;
    private float poolArea;
    private int floors;

    public Villa() {
    }

    // Getters
    public String getStandardRoom() {
        return standardRoom;
    }

    public float getPoolArea() {
        return poolArea;
    }

    public int getFloors() {
        return floors;
    }

    // Setters
    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public void setPoolArea(float poolArea) {
        this.poolArea = poolArea;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}
