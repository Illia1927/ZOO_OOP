package mate.academy.zoo;

import mate.academy.zoo.animals.Interface.Animal;
import mate.academy.zoo.aviaries.Cage;

public interface Zoo {
    void addCage(Cage<? extends Animal> cage);

    void feedAnimal();
}
