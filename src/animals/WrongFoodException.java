package animals;

public class WrongFoodException extends Exception{
    public String WrongFood() {
        return "This animal does not eat this kind of food";
    }
}
