package food;

public abstract class Meat extends Food {
    int callories;

    public Meat(int callories) {
        super(callories);
        this.callories = callories;
    }

    public int getCallories() {
        return callories;
    }
}
