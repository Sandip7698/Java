package inheritance;

public class Product {
    int p_id;
    String name;
    int price;

    Product(){
        System.out.println("Object is created");
    }
    void setproductdetail(int p_id,String name,int price){
        this.p_id=p_id;
        this.name=name;
        this.price=price;
    }
    void showdetails(){
        System.out.println("PID: "+p_id);
        System.out.println("Name:"+name);
        System.out.println("Price:"+price);
    }
}
class Demo{
    public static void main(String[] args) {
        Product product=new Product();
        product.setproductdetail(1,"Sandip",4555);
        product.showdetails();
    }
}
