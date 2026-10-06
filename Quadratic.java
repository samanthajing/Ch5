import 	java.util.Scanner;

public class Quadratic {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a-value: ");
		int aVal = in.nextInt();
		System.out.print("Enter b-value: ");
		int bVal = in.nextInt();
		System.out.print("Enter c-value: ");
		int cVal = in.nextInt();
		if (Discriminant(aVal, bVal, cVal)<0){
			System.out.print("Math Error: Cannot Take Squre Root of a Negative Number");
		} else {
			QuadraticFormula(aVal, bVal, cVal);
		}
	}
	
	public static void QuadraticFormula(int a, int b, int c){
		System.out.println("root: "+(-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a));
		System.out.println("second root: "+(-b-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a));
	}
	
	public static double Discriminant(int a, int b, int c){
		return (Math.pow(b,2)-4*a*c);
	}
}
