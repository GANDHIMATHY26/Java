import java.util.*;
public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no 1 = ");
        int a = sc.nextInt();
        System.out.println("Enter no 2 = ");
        int b = sc.nextInt();
        System.out.println("Enter no 3 = ");
        int c = sc.nextInt();
        System.out.print("Addition of " + a + " + " + b + " + " + c + " = " + sum(a, b, c));
    }
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
}
