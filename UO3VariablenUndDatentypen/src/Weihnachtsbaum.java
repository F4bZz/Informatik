public class Weihnachtsbaum {
	
	public static void main(String[] args) {
		int anzahl = 15;
		int i = 1;
		int j = 3;
		while (anzahl > 0) {
			printLeerzeichen(anzahl-1);
			printSterne(i);
			printLeerzeichen(anzahl-1);
			System.out.println();
			anzahl--;
			i = i+2;
			
		}
		anzahl = 3;
		while (anzahl > 0) {
			printLeerzeichen(13);
			printSterne(j);
			printLeerzeichen(13);
			anzahl--;
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
