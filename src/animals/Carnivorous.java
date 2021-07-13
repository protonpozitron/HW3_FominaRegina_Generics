package animals;

import food.Food;
import food.Grass;
import food.Meat;


public abstract class Carnivorous extends Animal {
    public String name;
    public Carnivorous(Long animalId,String name, int weight,CageSize cageSizeen) {
        super(animalId,name, weight,cageSizeen);
    }

    @Override
    public void eat(Food food)throws WrongFoodException {
        int callFull = food.getCallories();
        if (food instanceof Meat) {
            System.out.println("Подопечный зоопарка по имени " + this.getName() + " ест " + callFull + " ед. растительной пищи");
            full += callFull;
        } else {
            throw new WrongFoodException();
        }
    }

}
