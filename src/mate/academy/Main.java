package mate.academy;

import mate.academy.zoo.Zoo;
import mate.academy.zoo.zooImpl.ZooImpl;
import mate.academy.zoo.animals.Interface.Birds;
import mate.academy.zoo.animals.Interface.Fish;
import mate.academy.zoo.animals.Interface.Mammal;
import mate.academy.zoo.animals.Impl.Penguin;
import mate.academy.zoo.animals.Impl.Shark;
import mate.academy.zoo.animals.Impl.Sparrow;
import mate.academy.zoo.animals.Impl.Tiger;
import mate.academy.zoo.aviaries.AnimalCage;
import mate.academy.zoo.aviaries.Aquarium;
import mate.academy.zoo.aviaries.BirdCage;
import mate.academy.zoo.aviaries.Cage;

public class Main {
    public static void main(String[] args) {

        Zoo zoo = new ZooImpl();

        Cage<Mammal> animalCage = new AnimalCage();
        animalCage.addAnimals(new Tiger());

        Cage<Fish> aquariumCage = new Aquarium();
        aquariumCage.addAnimals(new Shark());

        Cage<Birds> birdsCage = new BirdCage();
        birdsCage.addAnimals(new Sparrow());
        birdsCage.addAnimals(new Penguin());

        zoo.addCage(animalCage);
        zoo.addCage(aquariumCage);
        zoo.addCage(birdsCage);

        zoo.feedAnimal();
    }
}
