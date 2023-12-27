public enum CustomerType {
    Diamond(0),
    Platinum(1),
    Gold(2),
    Silver(3),
    Member(4);

    private final int index;

    CustomerType(int index) {
        this.index = index;
    }

    public int getIndex() { 
        return index; 
    }

    public static CustomerType fromIndex(int index) {
        for (CustomerType type : CustomerType.values()) {
            if (type.getIndex() == index) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid CustomerType index: " + index);
    }
}