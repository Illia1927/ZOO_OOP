package mate.academy.zoo.aviaries;

import mate.academy.zoo.animals.Interface.Mammal;

import java.util.ArrayList;
import java.util.List;

public class AnimalCage implements Cage<Mammal> {

    private List<Mammal> mammals = new ArrayList<>();

    @Override
    public void feed() {
        for (Mammal mammal : mammals) {
            mammal.toEat();
        }
    }

    @Override
    public void addAnimals(Mammal mammal) {
        mammals.add(mammal);
    }
}
