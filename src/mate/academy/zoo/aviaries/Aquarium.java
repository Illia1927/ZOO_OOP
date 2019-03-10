package mate.academy.zoo.aviaries;

import mate.academy.zoo.animals.Interface.Fish;

import java.util.ArrayList;
import java.util.List;

public class Aquarium implements Cage<Fish>{

    private List<Fish> fishs = new ArrayList<>();

    @Override
    public void feed() {
        for (Fish fish : fishs) {
            fish.toEat();
        }
    }

    @Override
    public void addAnimals(Fish fish) {
        fishs.add(fish);
    }
}
