package interfacepkg;

import abstraction.Cat;

public interface Animal {
    public void animalsound();
    public void  sleep();
}
interface Animaltype{
    public void animaltype();
}
class cat implements Animal,Animaltype{

    @Override
    public void animalsound() {
        System.out.println("Mauuuu.....");
    }

    @Override
    public void sleep() {
        System.out.println("zzzz");
    }

    @Override
    public void animaltype() {
        System.out.println("Domastic");
    }
}
class ani{
    public static void main(String[] args) {
        cat c=new cat();
        c.animalsound();
        c.sleep();
        c.animaltype();
    }
}

