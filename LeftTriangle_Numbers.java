import java.util.*;
public class Main{
    public static void main(String[] args){
        System.out.println("Left Align Triangle with Numbers");
        System.out.println("----------------------------------");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows = ");
        int n=sc.nextInt();
        System.out.println("--------------------------");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
