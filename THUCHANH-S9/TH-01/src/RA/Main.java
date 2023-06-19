package RA;

import RA.Fruit.Apple;
import RA.Fruit.Fruit;
import RA.Fruit.Orange;
import RA.animals.Animals;
import RA.animals.Chicken;
import RA.animals.Tiger;
import RA.edible.IEdible;

public class Main {
    public static void main(String[] args) {
        Animals[] animals = new Animals[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animals animal: animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken){
                IEdible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit fruit :fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}