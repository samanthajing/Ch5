public class Fermat {
	public static boolean fermat(int a, int b, int c, int n) {
		return n>2&&(Math.pow(a,n)+Math.pow(b,n)==Math.pow(c,n));
	}
	
	public static void main (String[] args) {
		if (fermat( 3, 4, 5, 7)) {
			System.out.println("Holy smokes, Fermat was wrong!");
		} else {
			System.out.println("No, that doesn't work.");
		}
	}
}
