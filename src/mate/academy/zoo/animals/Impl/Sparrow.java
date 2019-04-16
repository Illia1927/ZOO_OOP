package mate.academy.zoo.animals.Impl;

import mate.academy.zoo.animals.Interface.Birds;

public class Sparrow implements Birds {
    @Override
    public void fly() {
        System.out.println("I can fly");
    }

    @Override
    public void toEat() {
        System.out.println("I love eat some food" + " /" + Sparrow.class + "/");
    }
}
