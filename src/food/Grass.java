package food;

public abstract class Grass extends Food {
    int callories;

    public Grass(int callories) {
        super(callories);
        this.callories = callories;
    }

    public int getCallories() {
        return callories;
    }
}