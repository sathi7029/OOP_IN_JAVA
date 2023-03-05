//here I demonstrate class,object,constructor,static and this keyword
package Day01;
//starting of class
public class ClassObject {
    int age;
    int  count_obj;


    //creation of constructor    
    public ClassObject(){
        count_obj++;
        System.out.println("zero parameter constructor");
     }

     //constructor with parameter
     public ClassObject(int age){
        count_obj++;
        this.age=age;//use of this keyword
        System.out.println("age is->"+age);
     } 

     //static method  
     static void display(){
        
        System.out.println("display of static method...");
     }

     //non-static method
     void display1(){
        count_obj++;
        System.out.println("non-static method...");
     }

    //main method
    public static void main(String[] args) {

        ClassObject c=new ClassObject();//object creation
        System.out.println();
        ClassObject c1=new ClassObject(19);//constructor with parameter
        System.out.println();
        c.display1();// non-static method calling
        System.out.println();
        display();//directly call  static method from main method
        System.out.println();
        System.out.println("number of object is->"+c.count_obj);
    }
}
