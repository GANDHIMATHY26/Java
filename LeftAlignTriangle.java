public class Main{
    public static void main(String[] args){
        System.out.println("Left Align Triangle with Asterisks");
        System.out.println("----------------------------------");
        int n=6;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
