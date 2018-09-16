package prototypePattern;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {

    private static Map<String,Shape> shapeMap = new HashMap<String, Shape>();

    public static Shape getShape(String id){
        Shape shape = shapeMap.get(id);
        return  (Shape) shape.clone();
    }

    public static void loadShape(){

        Square square = new Square();
        square.setId("1");
        shapeMap.put("1",square);


        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put("2",rectangle);

    }
}
