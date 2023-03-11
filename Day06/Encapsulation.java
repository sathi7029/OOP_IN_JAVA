package Day06;

public class Encapsulation {
    private int age;
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    
    public static void main(String[] args) {
        Encapsulation e=new Encapsulation();
        e.setAge(19);
        int age=e.getAge();
        System.out.println("age is->"+age);

    }
}
