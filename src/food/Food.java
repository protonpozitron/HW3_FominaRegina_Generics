package food;

public abstract class Food {
    int callories;

    public Food(int callories) {
        this.callories = callories;
    }

    public int getCallories() {
        return callories;
    }
}
