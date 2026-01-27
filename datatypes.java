
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("User Inputs");
		System.out.println("-------------------");
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Integer value: ");
	    int n=sc.nextInt();
	    System.out.println("Integer value: "+n);
	    System.out.println("Enter Float value: ");
	    float f=sc.nextFloat();
	    System.out.println("Float value: "+f);
	    System.out.println("Enter Short value: ");
	    Short sh=sc.nextShort();
	    System.out.println("Float value: "+sh);
	    System.out.println("Enter Boolean value (true / false) : ");
	    boolean bool=sc.nextBoolean();
	    System.out.println("Boolean value: "+bool);
	    System.out.println("Enter Double value: ");
	    double d=sc.nextDouble();
	    System.out.println("Double value: "+d);
	    System.out.println("Enter Char value: ");
	    char  c=sc.next().charAt(0);
	    System.out.println("Character value: "+c);
	    sc.nextLine();
	    System.out.println("Enter String value: ");
	    String s=sc.nextLine();
	    System.out.println("String value: "+s);
	}
}
