public enum UserRole {
    Admin(0),
    User(1);

    private final int index;

    UserRole(int index) {
        this.index = index;
    }

    public int getIndex() { 
        return index; 
    }

    public static UserRole fromIndex(int index) {
        for (UserRole type : UserRole.values()) {
            if (type.getIndex() == index) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid UserRole index: " + index);
    }
}