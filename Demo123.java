import java.util.Scanner;
public class Demo123 {

	public static void main(String[] args) {
		System.out.println("welcome to the project Addition");
		Scanner scan= new Scanner(System.in);
		System.out.print("value of a : ");
		int a= scan.nextInt();
		System.out.print("value of b : ");
		int b=scan.nextInt();
		int c=a+b;
		System.out.println("Sum of integers are:"+ c);

	}

}
