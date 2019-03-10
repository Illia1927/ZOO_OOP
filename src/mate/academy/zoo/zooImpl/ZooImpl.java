package mate.academy.zoo.zooImpl;

import mate.academy.zoo.Zoo;
import mate.academy.zoo.animals.Interface.Animal;
import mate.academy.zoo.aviaries.Cage;

import java.util.ArrayList;
import java.util.List;

public class ZooImpl implements Zoo {

    private List<Cage<? extends Animal>> cages = new ArrayList<>();

    @Override
    public void addCage(Cage<? extends Animal> cage) {
        cages.add(cage);
    }

    @Override
    public void feedAnimal() {
        for (Cage<? extends Animal> cage : cages) {
            cage.feed();
        }
    }
}
