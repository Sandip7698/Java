package Test1.encapsulation;

public class Encapsulation {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class sample1 {
    public static void main(String[] args) {
        Encapsulation en=new Encapsulation();
        en.setId(0);
        en.setName("Sandip");
        System.out.println("Id ="+en.getId());
        System.out.println("Name ="+en.getName());
    }

}

