public class Star2 {
    public static void main(String[] args) {
        for(int i=0;i<=5;i++){
            for(int j=1;i<=3;j++){
                if(j==1&&i==3||j==2&&i==2||j==2&&i==4||j==3&&i==1||j==3&&i==1||j==3&&i==2||j==3&&i==4||j==3&&i==5){
                    System.out.print(" *");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static class ClassnotFound {
        public static void main(String[] args) {
            try {
                Class.forName("arithmatic.java");
                System.out.println("Found");
            } catch (ClassNotFoundException e) {
                System.out.println("Class Not Found");
            }

        }
    }
}
