import animals.*;
import food.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zoo {
    public static void main(String[] args) throws VoiceException, WrongFoodException {
        Beef beef = new Beef(12);
        Barley barley = new Barley(10);
        Carrot carrot = new Carrot(5);
        Chiken chiken = new Chiken(4);
        Horsemeat horsemeat = new Horsemeat(20);
        Millet millet = new Millet(15);
        Mutton mutton = new Mutton(21);
        Oatmeal oatmeal = new Oatmeal(9);
        Pork pork = new Pork(22);
        List<Food> foodArray = new ArrayList<>();
        Collections.addAll(foodArray, beef, barley, carrot, chiken, horsemeat, millet, mutton, oatmeal, pork);
        Worker John = new Worker();
        Zebra Alfa = new Zebra(12L, "Альфа", 280);
        Donkey Beta = new Donkey(144L, "Бета", 90);
        Duck Charlie = new Duck(154L, "Чарли", 2);
        Fish killer_whale = new Fish(3254L, "Танк", 2000);
        Tiger Echo = new Tiger(12312L, "Эхо", 250);
        List<Animal> animalArray = new ArrayList<>();
        Collections.addAll(animalArray, Alfa, Beta, Charlie, killer_whale, Echo);
//        for (int i = 0; i < 5; i++) {  //кормление всех животных разными типами еды
//            int a = (int) (Math.random() * 4 + 1);
//            int b = (int) (Math.random() * 8 + 1);
//            John.feed(foodArray.get(b), animalArray.get(a));
//        }
        John.feed(foodArray.get(1), animalArray.get(0));

        John.getVoice(Charlie);
        John.getVoice(Echo);
        John.getVoice(Beta);
        Echo.run();
//        John.getVoice(killer_whale); // для вызова исключения
        Alfa.run();
        Swim[] swimmingPools = new Swim[4];
        swimmingPools[0] = Beta;
        swimmingPools[1] = Charlie;
        swimmingPools[2] = Echo;
        swimmingPools[3] = Alfa;
        for (int i = 0; i < 4; i++) {
            System.out.println(swimmingPools[i].toString());
        }
        Cage H = new Cage(CageSize.MEDIUM);
        H.addToTheCage(Beta);
        H.deleteToTheCage(Beta);
        //     H.animalLink("Танк");
    }

}
