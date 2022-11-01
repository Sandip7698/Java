package test.inheritance;

public class Animal {
    public void display(){
        System.out.println("Types of Animals");
    }
}
class Domastic extends Animal{
    public void display1(){
        System.out.println("This is Domastic Animal");
    }
}
class wild extends Animal{
    public void display3() {
        System.out.println("This is wild Animal");
    }
}
class main4{
    public static void main(String[] args) {
       wild w=new wild();
       w.display();
       w.display3();

       Domastic d=new Domastic();
       d.display();
       d.display1();
    }
}
