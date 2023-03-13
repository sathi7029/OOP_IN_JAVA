package Day08;
interface I1{
    void show();
}
interface I2{
    void show2();
}
class Test implements I1,I2{
    public void show(){
        System.out.println("interface 1");
    }
    public void show2(){
        System.out.println("interface2");
    }
}

public class DemofInterface {
    public static void main(String[] args) {
        Test t=new Test();
        t.show();
        t.show2();
    }
}
