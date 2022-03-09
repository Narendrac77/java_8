package src.generics.relationship;

import src.generics.customgeneric.Box;
import src.generics.customgeneric.Fruit;

public class TestGenericHierarchies {

    public static void main(String[] args) {
        Cardboardbox<Fruit> cardboardbox = new Cardboardbox<>();

        Box<Fruit> fruitBox = new Box<>();
        fruitBox = cardboardbox;
    }
}
