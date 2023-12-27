public enum FacilityType {
    Villa(0),
    House(1),
    Room(2);

    private final int index;

    FacilityType(int index) {
        this.index = index;
    }

    public int getIndex() { 
        return index; 
    }

    public static FacilityType fromIndex(int index) {
        for (FacilityType type : FacilityType.values()) {
            if (type.getIndex() == index) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid FacilityType index: " + index);
    }
}