package animals;

public class Duck extends Herbivores implements Voice, Swim, Fly, Run {
    String name;
    int weight;
    CageSize cageSizeen;
    Long animalId;
    public Duck(Long animalId,String name, int weight) {
        super(animalId,name, weight,CageSize.MEDIUM);
        this.animalId = animalId;
        this.name = name;
        this.weight = weight;
    }

    public void sleep() {
        if (full > 0) {
            System.out.println("Z-z-z-z-z");
        } else {
            this.voice();
        }
    }

    public void fly() {
        if (full > 0) {
            System.out.println("FLY!");
            full -= 1;
        } else {
            this.voice();
        }
    }

    @Override
    public void run() {
        if (full > 0) {
            System.out.println("Сбегает");
            full -= 2;
        } else {
            this.voice();
        }
    }

    @Override
    public void swim() {
        if (full > 0) {
            System.out.println("Утенок плавает");
        } else {
            this.voice();
        }

    }

    @Override
    public String voice() {
        return "Утенок по имени " + name + " говорит: Кря";
    }
}
