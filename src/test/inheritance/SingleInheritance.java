package test.inheritance;

public class SingleInheritance {
    public void display(){

        System.out.println("Hii");
    }
}
class B extends SingleInheritance{
    public void  display1(){

        System.out.println("Sandip");
    }

}
class main{
    public static void main(String[] args) {
        B b=new B();
        b.display();
        b.display1();
    }
}

