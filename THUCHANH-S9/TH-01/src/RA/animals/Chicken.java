package RA.animals;

import RA.edible.IEdible;

public class Chicken extends  Animals implements IEdible {

    @Override
    public String makeSound() {
        return "Chicken : Gà Gà Gà";
    }

    @Override
    public String howToEat() {
        return "Could be fried";
    }
}
