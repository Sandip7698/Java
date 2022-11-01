package abstraction;

public class Dog extends Animal{
    @Override
    public void animalSound() {
        System.out.println("Bhau.....");
    }
}
class main{
    public static void main(String[] args) {
        Dog d=new Dog();
        d.animalSound();
        d.sleep();
    }
}
