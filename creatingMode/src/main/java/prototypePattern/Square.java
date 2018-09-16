package prototypePattern;

public class Square extends Shape {

    public Square(){
        this.type="square";
    }

    void draw() {
        System.out.println("this is square");
    }
}
