
public class Quersumme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Quersumme");
		System.out.println("=========");
		//Eingabe i
		int z= readInt("Geben Sie die Zahl ein: ");
		int i = 1;
		int z1 = 0;
		
		//Berechnung der Quersumme
		while(z / i>1) {
			i=i*10;
		}
		System.out.println();
		System.out.println("Die Quersumme lautet: ");
		int summe = 0;
		while (z>= 1) {
			z1 = z/i;
			summe = summe + z1;
			System.out.print(z1 + " + ");
			z = z % i;
			i = i /10;
			
		}
		System.out.println("= "+ summe);
		
}		
		
		
		
		


	public static int readInt(String text) {
	    System.out.print(text);
	    return (new java.util.Scanner(System.in)).nextInt();
	  }

}
