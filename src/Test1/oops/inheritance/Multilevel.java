package Test1.oops.inheritance;

public class Multilevel {
    void show(){
        System.out.println("This is Parent Class");
    }
}
class C extends  Multilevel{
    @Override
    void show() {
        super.show();
        System.out.println("This is Sub Child Class");
    }
}
class E extends C{
    @Override
    void show() {
        super.show();
        System.out.println("This is Child Class");
    }

    public static void main(String[] args) {
        E e=new E();
        e.show();
    }
}
