package Test1.oops.inheritance;

public class Car {
    void show(){
        System.out.println("This is Car Parent Class");
    }
}
class BMW extends Car{
    @Override
    void show() {
        super.show();
        System.out.println("This is BMW car");
    }
}
class Mercadies extends Car{
    @Override
    void show() {
        super.show();
        System.out.println("This is Mercadies Car");
    }
}
class hirea{
    public static void main(String[] args) {
        BMW b=new BMW();
        b.show();
       // Mercadies m=new Mercadies();
        //m.show();
    }

}