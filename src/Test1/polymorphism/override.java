package Test1.polymorphism;

public class override {
    public void sound(){
        System.out.println("...");
    }
}
class Dog extends override{
    @Override
    public void sound() {
        System.out.println("Bhoo");
    }
}
class main3{
    public static void main(String[] args) {
        Dog d=new Dog();
        d.sound();
    }
}
