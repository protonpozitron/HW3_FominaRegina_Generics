import animals.Animal;
import animals.VoiceException;
import animals.WrongFoodException;
import food.Food;

public class Worker {

    public void feed(Food food1, Animal animal1) throws WrongFoodException {
        animal1.eat(food1);
        System.out.println();
    }

    public void getVoice(Animal animal1) throws VoiceException {
     //   if(animal1.voice() == null)!animal1.isExo()
        if (animal1.voice() == null) {
            throw new VoiceException();
        } else {
            System.out.println(animal1.voice());
        }
    }
}

