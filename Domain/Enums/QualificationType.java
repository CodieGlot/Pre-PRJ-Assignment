public enum QualificationType {
    Intermediate(0),
    College(1),
    University(2),
    PostGraduate(3);

    private final int index;

    QualificationType(int index) {
        this.index = index;
    }

    public int getIndex() { 
        return index; 
    }

    public static QualificationType fromIndex(int index) {
        for (QualificationType type : QualificationType.values()) {
            if (type.getIndex() == index) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid QualificationType index: " + index);
    }
}
