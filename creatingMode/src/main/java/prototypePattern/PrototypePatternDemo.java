package prototypePattern;

public class PrototypePatternDemo {

    public static void main(String[] args) {
        ShapeCache.loadShape();

        Shape shape = ShapeCache.getShape("1");
        System.out.println("shape : " +shape.getType());

        Shape shape1 = ShapeCache.getShape("2");
        System.out.println("shape : " +shape1.getType());
    }
}
