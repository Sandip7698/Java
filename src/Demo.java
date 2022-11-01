public class Demo {
    int a;
    int b;


    public void setA(int a) {
        this.a = a;
    }
    public int getA() {
        return a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public static void main(String[] args) {
        Demo d=new Demo();
        d.setA(5);
        d.setB(6);
        System.out.println( d.getA());
        System.out.println( d.getB());
    }
}
