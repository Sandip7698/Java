import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println(arrayList);

        Iterator itr=arrayList.iterator();
      
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
