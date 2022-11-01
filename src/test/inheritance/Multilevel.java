package test.inheritance;

public class Multilevel {
    public void display(){
        System.out.println("Hii");
    }
}
class A extends Multilevel{
    public void  display1(){
        System.out.println("Sandip");
    }

}
class  K extends A{
    public void display2(){
        System.out.println("Jadhav");
    }
}

class main1{
    public static void main(String[] args) {
        K k=new K();
        k.display();
        k.display1();
        k.display2();
    }
}

