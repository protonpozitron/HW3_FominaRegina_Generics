package animals;

public class Tiger extends Carnivorous implements Swim, Run, Voice {
    String name;
    int weight;
    Long animalId;
    CageSize cageSizeen;
    public Tiger(Long animalId,String name, int weight) {
        super(animalId,name, weight,CageSize.SPACIOUS);
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

    public void run() {
        if (full > 0) {
            System.out.println("Бегает");
        } else {
            this.voice();
        }
    }

    public void swim() {
        if (full > 0) {
            System.out.println("Тигр плавает");
            full -= 1;
        } else {
            this.voice();
        }
    }

    @Override
    public String voice() {
        return "Тигр по имени " + name + " говорит: Мур";
    }
}

