package abstraction;

public class Cat extends Animal{
    @Override
    public void animalSound() {
        System.out.println("Mau....");
    }
}
class main1 {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.animalSound();
        c.sleep();
    }
}
