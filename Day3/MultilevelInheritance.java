package Day3;
class car{
    void color(){
        System.out.println("car color...");
    }
    void run(){
        System.out.println("car is running...");
    }
}
class Mahendra extends car{
    void brand(){
        System.out.println("...mehandra");
    }
}
class Scorpio extends Mahendra{

}
public class MultilevelInheritance {
    public static void main(String[] args) {
        Mahendra m=new Mahendra();
        m.color();
        m.brand();
        m.run();
        Scorpio s=new Scorpio();
        s.brand();s.run();
        s.color();
    }
}
