package Test1.interfaces;

public class functionalInterface implements functional{
    @Override
    public int sub(int a, int b) {
        return a-b;
    }
    public static void main(String[] args) {
        functionalInterface f=new functionalInterface();
        System.out.println( "Result="+f.sub(5,4));

    }
}
