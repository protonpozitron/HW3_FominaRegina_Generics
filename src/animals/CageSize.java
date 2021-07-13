package animals;

public enum CageSize {
    SMALL(2),
    MEDIUM(3),
    BIG(4),
    SPACIOUS(5);
    private int value;

    private CageSize(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}

