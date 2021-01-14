
public class HaarigeSache {

	public static void main(String[] args) {
		int a = 3; int b = 6;
		einHaar(a,b); zweiHaar(b,a);
	}

	public static void einHaar(int x, int y) {
		 int a = x + y;
		 System.out.println(a + " " + (int)(a - x) + " " + (int)(a - y));
		 }

	public static void zweiHaar(int x, int y) {
		 unterHaar(x); unterHaar(y);
		 int a = x + y; int b = 3 + x;
		 einHaar(a, b);
		 }

	public static void unterHaar(int a) {
		 int x = 6;
		 a = a + x;
		 System.out.println(a + " " + x);
		 }

}
