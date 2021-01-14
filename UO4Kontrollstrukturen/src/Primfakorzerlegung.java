
public class Primfakorzerlegung {

	public static void main(String[] args) {
		//Überschrift
		System.out.println("Primfaktorzerlegung");
		System.out.println("=================");
		
		//Variablen
		int n = 0;
		int t = 2;
		//Zahl wird eingegeben und getestet, ob sie größer als 0 ist
		while(true) {
			n = TestScanner.readInt("Geben Sie die Zahl ein: ");
			if(n > 1) {
				break;
			}else {
				System.out.println("Die Zahl muss größer als 1 sein");
			}
		}
		
			
			
		//Primfaktoren werden zerlegt
		while(n>1) {
			if(n%t==0){
				n = n/t;
				
				System.out.print(t);
				if (n > 1) {
					System.out.print(" + ");
				}
				
				
				
			}else
				t++;
		}
		System.out.print(" = "+ n);

	}

}
