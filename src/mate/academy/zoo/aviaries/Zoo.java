package mate.academy.zoo.aviaries;

import mate.academy.hw.zoo.animals.Animal;

import java.util.ArrayList;
import java.util.List;

public interface Zoo<A> {

    void addAnimal(A animal);

    void feed();
}
