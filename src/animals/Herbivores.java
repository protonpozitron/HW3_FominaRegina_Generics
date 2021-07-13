package animals;

import food.Food;
import food.Grass;

public abstract class Herbivores extends Animal {
    public Herbivores(Long animalId,String name, int weight,CageSize cageSizeen) {
        super(animalId,name, weight,cageSizeen);
    }

    public void eat(Food food)throws WrongFoodException{
        int callFull = food.getCallories();
        if (food instanceof Grass) {
            System.out.println("Подопечный зоопарка по имени " + this.getName() + " ест " + callFull + " ед. растительной пищи");
            full += callFull;
        } else {
            throw new WrongFoodException();
        }
    }

}