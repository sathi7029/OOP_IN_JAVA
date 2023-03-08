package Day04;

public class MethodOverloading {
    void display(){
        System.out.println("display1");
    }
    void display(int a){
        System.out.println("display 2");
    }
    void display(int a ,int b){
        System.out.println("display 3");
    }
    void display(int a ,int b,float c){
        System.out.println("display 4");
    }
    public static void main(String[] args) {
        MethodOverloading m=new MethodOverloading();
        m.display(8);
        m.display();
        m.display(2, 9);
        m.display(8, 9, 1.0f);
    }
}
