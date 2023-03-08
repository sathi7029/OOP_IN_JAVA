//here we see basic of inheritance also...see single level inheritence
package Day03;
class Human{
    void walk(){
        System.out.println("human is walking...");
    }
    void eat(){
        System.out.println("human is eating...");
    }
}
class Female extends Human{

}

public class BasicOfInheritance {
    public static void main(String[] args) {
        Female f=new Female();
        f.eat();
        f.walk();
    }
}
