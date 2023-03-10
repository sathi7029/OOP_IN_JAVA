package Day05;

import javax.sound.sampled.SourceDataLine;

class Animal{
    void sound(){
        System.out.println("no specific...");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("vawwwww vawww...");
    }
}
class cat extends Animal{
    @Override
    void sound(){
    System.out.println("maaaa awwwww...");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Animal a;
        a=new Dog();
        a.sound();
        System.out.println();
        a=new cat();
        a.sound();
    }
}
