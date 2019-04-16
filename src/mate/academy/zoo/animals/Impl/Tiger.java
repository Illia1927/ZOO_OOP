package mate.academy.zoo.animals.Impl;

import mate.academy.zoo.animals.Interface.Mammal;

public class Tiger implements Mammal {
    @Override
    public void run() {
        System.out.println("I`m fast runner");
    }

    @Override
    public void toEat() {
        System.out.println("I love eat some food" + " /" + Tiger.class + "/");
    }
}
