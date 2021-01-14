
public class Zeichensatzanalyse {

	public static void main(String[] args) {
		
		
		//die Buchstaben werden alle ausgegeben
		System.out.println("isLetter");
		for(int i = 33;i <= 256;i++) {
			if(Character.isLetter((char)i)) {
				printZahl(i);
				int j = 0;
				j++;
				
			}
			
		}
		//die Zahlen werden ausgegeben
		System.out.println("");
		System.out.println("isDigit");
		for(int i = 33;i <= 256;i++) {
			if(Character.isDigit((char)i)) {
				printZahl(i);
			}
			
		}
		//Die Leerzeichen werden ausgegeben
		System.out.println("");
		System.out.println("isWhitespace");
		for(int i = 33;i <= 256;i++) {
			if(Character.isWhitespace((char)i)) {
				printZahl(i);
			}
			
		}
		//Die kleinbuchstaben werden ausgegeben
		System.out.println("");
		System.out.println("isLowerCase");
		for(int i = 33;i <= 256;i++) {
			if(Character.isLowerCase((char)i)) {
				printZahl(i);
			}
			
		}
		//Die Großbuchstaben werden ausgegeben
		System.out.println("");
		System.out.println("isUpperCase");
		for(int i = 33;i <= 256;i++) {
			if(Character.isUpperCase((char)i)) {
				printZahl(i);
			}
			
		}
			
		
		
		
		

	}
	public static void printZahl(int i) {
		System.out.print((char)i+" ");
		
	}
}

