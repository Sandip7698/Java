package Test1;

public class pyramid {
    public static void main(String[] args) {
        int l,m=0;
        for(int i=6;i>=1;i--){
            l=m;
            for (int j=6-1;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=i;k>=1;k--){

                if(i==6&&k==5){
                    System.out.print(" ");
                    l++;
                }else{
                  System.out.print(++l+ " ");

                }
            }
            m++;
            System.out.println();
        }

    }

}
