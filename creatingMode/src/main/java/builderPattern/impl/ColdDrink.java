package builderPattern.impl;

import builderPattern.Item;
import builderPattern.Packing;

public abstract class ColdDrink implements Item {

    public Packing packing() {
        return new Bottle();
    }
}
