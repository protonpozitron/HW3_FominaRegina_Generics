package animals;

import food.Food;

import java.util.Objects;

public abstract class Animal implements Voice {
    private String name;
    private final int weight;
    public int full;
    private Long animalId;
    private CageSize cageSizeen;

    public Animal(Long animalId, String name, int weight, CageSize cageSizeen) {
        this.animalId = animalId;
        this.name = name;
        this.weight = weight;
        this.cageSizeen = cageSizeen;
    }

    public void eat(Food food) throws WrongFoodException {
    }

    public abstract void sleep();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {

        return weight;
    }

    public Long getAnimalId() {
        return animalId;
    }

    public void setAnimalId(Long animalId) {
        this.animalId = animalId;
    }

    public CageSize getCageSizeen() {
        return cageSizeen;
    }

    public String toString() {
        return "Подопечный по имени " + this.name + " плавает в пруду";
    }

    @Override
    public boolean equals(Object o) {
        if (getClass() != o.getClass())
            return false;
        Animal animal = (Animal) o;
        return animalId.equals(animal.animalId) && cageSizeen.equals(animal.cageSizeen);
    }

    @Override
    public int hashCode() {
        return animalId.hashCode();
    }
}
