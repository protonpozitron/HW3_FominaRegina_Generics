package animals;

import java.util.HashMap;
import java.util.Map;

import animals.Animal;
import animals.CageSize;

public class Cage<T extends Animal> {
    private T e;
    CageSize size;
    private Map<Long, Animal> cageSizeMap = new HashMap<>();
    private Long Idanimal;

    public Cage(CageSize size) {
        this.size = size;
    }

    public void addToTheCage(T e) {
        Animal animal = (Animal) e;
        if (this.size.equals(animal.getCageSizeen()) ) {
            cageSizeMap.put(animal.getAnimalId(), animal);
            System.out.println("Подопопечный по имени " + e.getName() + " помещен в вольер");
        } else {
            System.out.println("Неподходящая клетка для " + e.getName());
        }
    }

    public void deleteToTheCage(T e) {
        Animal animal = (Animal) e;
        cageSizeMap.remove(animal.getAnimalId(), animal);
        System.out.println("Подопопечный по имени " + e.getName() + " удален из вольера");
    }

    public void animalLink(Long Idanimal) {
        this.Idanimal = Idanimal;
        System.out.println(cageSizeMap.hashCode());
    }
}
