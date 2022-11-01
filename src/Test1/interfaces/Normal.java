package Test1.interfaces;

public class Normal implements normalinterface{
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int sub(int a, int b) {
        return a-b;
    }

    public static void main(String[] args) {
        Normal n=new Normal();
        System.out.println("Addition = "+ n.add(2,3));
        System.out.println("Substraction ="+ n.sub(3,2));
    }
}
