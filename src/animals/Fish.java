package animals;

public class Fish extends Carnivorous implements Swim, Voice {
    String name;
    int weight;
    Long animalId;
    public Fish(Long animalId,String name, int weight) {
        super(animalId,name, weight,CageSize.SPACIOUS);
        this.animalId = animalId;
        this.name = name;
        this.weight = weight;
    }

    public void sleep() {
        System.out.println("Z-z-z-z-z");
    }

    public void swim() {
        System.out.println("Плавает кругами");
    }

    public String voice() {
        return null;
    }
}
