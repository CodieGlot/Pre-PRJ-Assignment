public enum PositionType {
    RECEPTIONIST(0),
    SERVER(1),
    SPECIALIST(2),
    SUPERVISOR(3),
    MANAGER(4),
    DIRECTOR(5);

    private final int index;

    PositionType(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public static PositionType fromIndex(int index) {
        for (PositionType type : PositionType.values()) {
            if (type.getIndex() == index) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid PositionType index: " + index);
    }
}
