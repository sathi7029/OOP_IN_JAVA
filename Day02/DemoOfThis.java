package Day02;
public class DemoOfThis {
    int age;
    void display(int age){
        this.age=age;
        System.out.println(age);
    }
    public static void main(String[] args) {
        DemoOfThis d=new DemoOfThis();
        d.display(19);
    }
}
