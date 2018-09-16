package factory.demo;

import factory.AbstractFactory;
import factory.FactoryProducer;
import factory.model.Shape;

public class AbstractFactoryTest {

    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        Shape circel = shapeFactory.getShape("circel");
        circel.draw();
        shapeFactory.getShape("square").draw();
        shapeFactory.getShape("rectangle").draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        colorFactory.getColor("red").fill();
        colorFactory.getColor("green").fill();

    }
}
