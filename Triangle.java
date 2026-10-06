import java.util.Scanner;

public class Triangle{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a-value: ");
		int a = in.nextInt();
		System.out.print("Enter b-value: ");
		int b = in.nextInt();
		System.out.print("Enter c-value: ");
		int c = in.nextInt();
		if (a<=0||b<=0||c<=0){
			System.out.print("Error: Length Cannot Be Zero or Negative");
		} else if (test(a, b, c)){
			System.out.println("Can form a triangle");
		} else {
			System.out.println("Cannot form a triangle");
		}
	}
	
	public static boolean test(int a, int b, int c){
		return (a>b+c||b>a+c||c>b+a);
	}
	
}
