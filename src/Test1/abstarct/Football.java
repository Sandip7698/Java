package Test1.abstarct;

public class Football extends game {
    @Override
    public void play() {

        System.out.println("Football is Outdoor Game");
    }
}
class sample{
    public static void main(String[] args) {
        Football f=new Football();
        f.play();
    }

        }
