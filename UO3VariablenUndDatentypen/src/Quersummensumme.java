
public class Quersummensumme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Quersummensumme");
		System.out.println("===============");
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
		System.out.print("= "+ summe);
		
		System.out.print(" = ");
		i = 1;
		z1 = 0;
		while(summe / i>1) {
			i = i*10;
			
		}
		int summe2 = 0;
		while(summe >=1) {
			z1 = summe/i;
			summe2 = summe2 +z1;
			System.out.print(z1 + " + ");
			summe = summe % i;
			i = i /10;
		
		}
		System.out.println("= "+ summe2);
	
		
		
}		
		
		
		public static int readInt(String text) {
	    System.out.print(text);
	    return (new java.util.Scanner(System.in)).nextInt();
	}

	

}
