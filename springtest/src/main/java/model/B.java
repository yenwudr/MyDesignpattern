package model;

public class B extends A {

    static {
        System.out.println("aspectj");
    }

    public B(){
        System.out.println("b");
    }

}
