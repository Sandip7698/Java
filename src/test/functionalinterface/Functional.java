package test.functionalinterface;

interface myinterface{
    Integer add(Integer a,Integer b);
}

public class Functional implements myinterface{
    @Override
    public Integer add(Integer a, Integer b) {
        return a+b;
    }

    public static void main(String[] args) {

        Functional fun = new Functional();
        System.out.println(fun.add(3, 3 ));
    }

}
