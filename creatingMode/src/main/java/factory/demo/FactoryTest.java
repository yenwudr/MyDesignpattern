package factory.demo;

import factory.ShapeFactory;
import factory.model.Shape;

public class FactoryTest {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape shape = factory.getShape(ShapeFactory.SHAPE_CIRCEL);
        shape.draw();
        Shape shape1 = factory.getShape(ShapeFactory.SHAPE_RECTANGLE);
        shape1.draw();
        Shape shape2 = factory.getShape(ShapeFactory.SHAPE_SQUARE);
        shape2.draw();

    }
}
