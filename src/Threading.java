public class Threading extends Thread {
    @Override
    public void run() {
        System.out.println("Thread  Started ");
    }

}
class mul{
    public static void main(String[] args) {
        Threading t=new Threading();
        Threading t1=new Threading();
        Threading t2=new Threading();
        Threading t3=new Threading();
       // t.start();
        //t.getPriority();

        t1.setPriority(2);
        t2.setPriority(1);
        t3.setPriority(24);

        t1.getPriority();
        t2.getPriority();
        t3.getPriority();
    }
}

