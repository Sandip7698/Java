package Test1.oops.inheritance;

public class SingleInheritance {
    void show(){
        System.out.println("This is Parent Class");
    }
}
class A extends SingleInheritance{
    @Override
    void show() {
        super.show();
        System.out.println("This is Derived Class");
    }
}
class B{
    public static void main(String[] args) {
        A a=new A();
        a.show();
    }
}
