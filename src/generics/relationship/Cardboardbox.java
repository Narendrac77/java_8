package src.generics.relationship;

import src.generics.customgeneric.Box;
import src.generics.customgeneric.Boxable;

public class Cardboardbox<T extends Boxable> extends Box<T> {

    @Override
    public double getTotalWeight(){
        return super.getTotalWeight() + 0.1;
    }
}
