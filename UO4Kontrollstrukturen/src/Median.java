
public class Median {

	public static void main(String[] args) {
		System.out.println("Median");
		System.out.println("=======");
		int z1 = TestScanner.readInt("1. Zahl: ");
		int z2 = TestScanner.readInt("2. Zahl: ");
		int z3 = TestScanner.readInt("3. Zahl: ");
		//Test ob z1 der Median ist 
		if(z1<=z2 && z1>=z3 || z1>=z2 && z1<=z3) {
			System.out.println("Der Median lautet: "+z1);
		}
		//Test ob z2 der Median ist
		if(z2<=z1 && z2>=z3 || z2>=z1 && z2<=z3) {
			System.out.println("Der Median lautet: "+z2);
		}
		//Test ob z3 der Median ist 
	   if(z3<=z1 && z3>=z2 || z3>=z1 && z3<=z2) {
		   System.out.println("Der Median lautet: "+z3);
	   }
	}

}
