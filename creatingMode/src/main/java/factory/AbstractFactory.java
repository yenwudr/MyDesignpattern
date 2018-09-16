package factory;

import factory.model.Color;
import factory.model.Shape;

public abstract class AbstractFactory {

    public abstract  Shape getShape(String shapeName);
    public abstract Color getColor(String colorName);
}
