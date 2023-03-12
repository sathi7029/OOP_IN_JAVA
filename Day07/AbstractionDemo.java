package Day07;

import javax.swing.AbstractAction;

abstract class Area{
    abstract void area();
    void display(){
        System.out.println("i use area abstract method....");
    }
}
class Rectangle extends Area{
    void area(){
        System.out.println("i am a area funtion of Rectangle...");
    }
}
class Squre extends Area{
    void area(){
        System.out.println("i am a area funtion of squre...");
    }
}
public class AbstractionDemo {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.area();
        r.display();
        System.out.println();
        Squre s=new Squre();
        s.area();
        s.display();
    }
}
