package mate.academy.zoo.animals.Impl;

import mate.academy.zoo.animals.Interface.Fish;

public class Shark implements Fish {
    @Override
    public void swim() {
        System.out.println("I love swim");
    }

    @Override
    public void toEat() {
        System.out.println("I love eat some food" + " /" + Shark.class + "/");
    }
}
