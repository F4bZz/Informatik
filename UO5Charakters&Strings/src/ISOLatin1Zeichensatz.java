
public class ISOLatin1Zeichensatz {

	public static void main(String[] args) {
		//Variablen deklarieren
		int i = 32;
		char c = 32;
		
		//die Zahlen werden in den ISO Zeichensatz übertragen
		while (i < 256) {
			if((i - 32)%8 == 0) {
				System.out.println();
				
			}
			printZahl(i);
			i++;
			System.out.print(c);
			c++;
		}
		
		
	//Methode für Leerzeichen vor und nach der Zahl
	}
	public static void printZahl(int i) {
    	if(i < 10)
    		System.out.print(" " + i + "   ");
    	else if(i < 100)
    		System.out.print(" " + i + "  ");
    	else if(i < 1000)
    		System.out.print(" " + i + " ");
    	
    	
    	
    	
    }

}
