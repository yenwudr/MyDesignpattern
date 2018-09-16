package builderPattern.impl;

import builderPattern.Item;
import builderPattern.Packing;

public abstract class Burger implements Item {
    public Packing packing() {
        return new Wrapper();
    }
}
