package animals;

public class Zebra extends Herbivores implements Run, Voice, Swim {
    String name;
    int weight;
    Long animalId;

    public Zebra(Long animalId,String name, int weight) {
        super(animalId,name, weight,CageSize.BIG);
        this.animalId = animalId;
        this.name = name;
        this.weight = weight;
    }

    public void sleep() {
        if (full > 0) {
            System.out.println("Z-z-z-z-z");
            full -= 1;
        } else {
            this.voice();
        }
    }

    @Override
    public void run() {
        if (full > 0) {
            System.out.println("Бежит галопом");
            full -= 2;
        } else {
            this.voice();
        }
    }

    @Override
    public String voice() {
        return "Зебра по имени " + name + " ржет";
    }

    public void swim() {
        System.out.println("Плавает");
    }
}
