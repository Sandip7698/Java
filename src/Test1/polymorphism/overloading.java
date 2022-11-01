package Test1.polymorphism;

public class overloading {
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        overloading o=new overloading();
        System.out.println(o.add(2,5));
        System.out.println(o.add(3,4,5));;

    }
}
