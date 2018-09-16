package factory;

import factory.model.Color;
import factory.model.Shape;
import factory.model.impl.Green;
import factory.model.impl.Red;

public class ColorFactory extends AbstractFactory {

    public static String COLOR_RED="red";
    public static String COLOR_GREEN="green";


    public Shape getShape(String shapeName) {
        return null;
    }

    public Color getColor(String colorName) {
        if (colorName.equals(COLOR_RED)){
            return new Red();
        }else if (colorName.equals(COLOR_GREEN)){
            return new Green();
        }
        return null;
    }
}
