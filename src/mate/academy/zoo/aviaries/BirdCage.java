package mate.academy.zoo.aviaries;

import mate.academy.zoo.animals.Interface.Birds;

import java.util.ArrayList;
import java.util.List;

public class BirdCage implements Cage<Birds> {

    private List<Birds> birds = new ArrayList<>();

    @Override
    public void feed() {
        for (Birds bird : birds) {
            bird.toEat();
        }
    }

    @Override
    public void addAnimals(Birds bird) {
        birds.add(bird);
    }
}
