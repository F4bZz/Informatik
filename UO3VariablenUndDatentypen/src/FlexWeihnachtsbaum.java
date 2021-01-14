
public class FlexWeihnachtsbaum {

	public static void main(String[] args) {
		System.out.println("Der flexible Weihnachtsbaum");
		System.out.println("===========================");
		int anzahl = TestScanner.readInt("Geben Sie die Höhne des Baumes ein: ");
		int j = TestScanner.readInt("Geben Sie die Höhne des Stammes ein: ");
		int i = 1;
		int z = anzahl;
		int h = 3;
		while (anzahl > 0) {
			printLeerzeichen(anzahl-1);
			printSterne(i);
			printLeerzeichen(anzahl-1);
			System.out.println();
			anzahl--;
			i = i+2;
			
		}
		
		while (j> 0) {
			printLeerzeichen(z-2);
			printSterne(h);
			printLeerzeichen(z-2);
			j--;
			System.out.println();
		}		
		
		
	}
	
	public static void printLeerzeichen(int anzahl) {
		while(anzahl>0) {
			System.out.print(" ");
			anzahl--;
		}
		
	}
	
	public static void printSterne(int anzahl) {
		while (anzahl > 0) {
			System.out.print("*");
			anzahl--;
		}
		
		
		
	}

}


