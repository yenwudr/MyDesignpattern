package factory;

import factory.model.Color;
import factory.model.impl.Circel;
import factory.model.impl.Rectangle;
import factory.model.Shape;
import factory.model.impl.Square;

public class ShapeFactory extends AbstractFactory{
    public static String SHAPE_CIRCEL="circel";
    public static String SHAPE_SQUARE="square";
    public static String SHAPE_RECTANGLE="rectangle";

    @Override
    public Shape getShape(String shapeName){
        if (shapeName.equals(SHAPE_CIRCEL)){
            return new Circel();
        }else if(shapeName.equals(SHAPE_RECTANGLE)){
            return new Rectangle();
        }else if (shapeName.equals(SHAPE_SQUARE)){
            return new Square();
        }
        return null;
    }

    public Color getColor(String colorName) {
        return null;
    }
}
