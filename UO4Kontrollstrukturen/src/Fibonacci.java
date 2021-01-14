
public class Fibonacci {

	public static void main(String[] args) {
		//Überschrift
		System.out.println("Fibonacci-Zahlen");
		System.out.println("=================");
		
		//Variablen
		int n = 0;
		int n1 = 0;
		int n2 = 1;
		int fibzahl = 0;
		int i = 1;
		//Zahl wird eingegeben und getestet, ob sie größer als 0 ist
		while(true) {
			n = TestScanner.readInt("Die wievielte zahl? ");
			if(n >= 0) {
				break;
			}else {
				System.out.println("Die Zahl muss größer oder gleich Null sein");
			}
		}
		//Fibonacci Zahl wird ausgerechnet
		if (n==0) {
			fibzahl = 0;
		}else if(n==1) {
			fibzahl = 1;
		}
		
		while (n>i) {
			fibzahl = n1 + n2;
			n1 = n2;
			n2 = fibzahl;
			i++;
		}
		
		System.out.println();
		System.out.println("Die " + n + ". Fibonacci-Zahl lautet " + fibzahl);
		

	}

}
