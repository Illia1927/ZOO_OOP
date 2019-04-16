package mate.academy.zoo.aviaries;

import mate.academy.zoo.animals.Interface.Animal;

public interface Cage<T extends Animal> {
    void feed();

    void addAnimals(T animal);
}
