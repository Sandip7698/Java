public class Square {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                if (j==5||j>=4&&i==5||j>=4&&i==1||i==2&&j==1||i==3&&j==1||i==4&&j==1)
                    System.out.print(" * ");
                else

                    System.out.print("   ");
                }
                System.out.println();
            }

        }
    }

